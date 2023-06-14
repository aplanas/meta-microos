SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "Python build backend (PEP 517) for Meson projects."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python311-meson-python-0.12.1-1.2.noarch.rpm"
RPM_HASH = "236cc58e5b7292db3b1b7c1cea5386406f895a4d00a7316b7555830078eace64e1ef5c908b3db13db8616d131c62c1a80d53cd1b3aab821d406d0afec1a1c793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-meson-python \
python311-meson-python \
python3dist-meson-python"

RDEPENDS:${PN} += "meson \
python-abi \
python311-pyproject-metadata"

inherit rpm
