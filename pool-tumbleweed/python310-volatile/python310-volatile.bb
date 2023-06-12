SUMMARY = "Python extension for the tempfile module"
DESCRIPTION = "A small Python extension for the tempfile module."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-volatile-2.1.0-1.11.noarch.rpm"
RPM_HASH = "a1ba7cad177407de561b6100143a243d7873047039fe00752c26a361dd751e8413e5aa61672a27601d326da9e61327c5a5432072d6d4448c41bb3a2c0fcab63d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-volatile \
python3.10dist(volatile) \
python310-volatile \
python3dist(volatile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
