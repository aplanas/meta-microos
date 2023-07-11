SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-timeout-decorator-0.5.0-1.3.noarch.rpm"
RPM_HASH = "34f4cd50b77aef6fdde6e5606caad10498ed7be841b78489c68f8ec4b4f9b4fe2cf22fef86fe374404ce516a3e32a80f47540272893b0bba30e2ff8cc0b133ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-timeout-decorator \
python39-timeout-decorator \
python3dist-timeout-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
