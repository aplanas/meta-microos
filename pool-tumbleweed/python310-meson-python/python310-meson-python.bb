SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "Python build backend (PEP 517) for Meson projects."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python310-meson-python-0.12.1-2.2.noarch.rpm"
RPM_HASH = "34e9f351c0e23c9f3f8505fd7f5adb9047e903cf67991971e5a7943f3be7a7dda4e8b527ec2dc4ecb5c77fb2812856fcc3dbc1750daaeee8766afe8629ed9f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-meson-python \
python310-meson-python \
python3dist-meson-python"

RDEPENDS:${PN} += "meson \
python-abi \
python310-pyproject-metadata \
python310-tomli"

inherit rpm
