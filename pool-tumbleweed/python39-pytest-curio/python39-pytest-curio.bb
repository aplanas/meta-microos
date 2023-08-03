SUMMARY = "Pytest support for curio"
DESCRIPTION = "Pytest support for curio."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python39-pytest-curio-1.0.1-2.1.noarch.rpm"
RPM_HASH = "73156b4a5f0494fd7c76bf764b76b28d79859d4f779819a90b8e1b8a51538fd04b34f3bfd9ecf8e3a6c243cccde3445cd3dabc2d881aacb30217e96a47d5c4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-curio \
python39-pytest-curio \
python3dist-pytest-curio"

RDEPENDS:${PN} += "python-abi \
python39-curio \
python39-pytest"

inherit rpm
