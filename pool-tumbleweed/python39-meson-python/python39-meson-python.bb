SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "Python build backend (PEP 517) for Meson projects."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python39-meson-python-0.12.1-1.2.noarch.rpm"
RPM_HASH = "cb5a3c0de3ea13dbe78c02b123ec54bb1e153fb971b4f8927445775ea3218c0b38cd3eeb0cce5b3714e0e0df801523a35df8c82e8db6323ed5325dd80c1a2348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-meson-python \
python39-meson-python \
python3dist-meson-python"

RDEPENDS:${PN} += "meson \
python-abi \
python39-pyproject-metadata \
python39-tomli \
python39-typing-extensions"

inherit rpm
