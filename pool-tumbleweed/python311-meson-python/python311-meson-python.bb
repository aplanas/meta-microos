SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "Python build backend (PEP 517) for Meson projects."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python311-meson-python-0.12.1-2.2.noarch.rpm"
RPM_HASH = "7c7dc5e8dc301beedc1ddf0d691a119ee9dc84231075da5c53abcc6d482a1202e560f744a521d8bd4982747ce2080861e5a3437c7c49c01279fdf29220d1b041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-meson-python \
python3.11dist-meson-python \
python311-meson-python \
python3dist-meson-python"

RDEPENDS:${PN} += "meson \
python-abi \
python311-pyproject-metadata"

inherit rpm
