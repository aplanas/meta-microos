SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "Python build backend (PEP 517) for Meson projects."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python310-meson-python-0.12.1-1.2.noarch.rpm"
RPM_HASH = "f5e6cd2f22c4c4a6880a400faf4a887f46df622f6bd0aab4b851837d20c1254eb48b922b21ac8cda6420cd18cd68bd9f3ef996d0f250ad320af9d610697f615b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-meson-python \
python3.10dist(meson-python) \
python310-meson-python \
python3dist(meson-python)"
RDEPENDS:${PN} += "meson \
python(abi) \
python310-pyproject-metadata \
python310-tomli"

inherit rpm
