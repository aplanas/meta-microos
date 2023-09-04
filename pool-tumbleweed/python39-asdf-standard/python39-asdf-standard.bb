SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python39-asdf-standard-1.0.3-2.1.noarch.rpm"
RPM_HASH = "5ba36151f2f44c014d5f1f64430eeb87023215e151b702d2ebeb743b4cb6ad42730a86df7c7047def4eee5d682b7eb9b8040faf9bfc2bb20cad56174b875f86f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asdf-standard \
python39-asdf-standard \
python3dist-asdf-standard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
