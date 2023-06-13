SUMMARY = "Color palettes for Python"
DESCRIPTION = "Palettable (formerly brewer2mpl) is a library of color palettes for Python. \
It's written in pure Python with no dependencies, but it can supply color maps \
for matplotlib. You can use Palettable to customize matplotlib plots or supply \
colors for a web application."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-palettable-3.3.0-1.19.noarch.rpm"
RPM_HASH = "8368621829f1a1d1fb63467a86a5fc2fe20807e661c2c9f790c0f56e8dfc1de7592560d257651f1e12814af9b6999e7fab11061014546e0f794a057d687ee2fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(palettable) \
python311-palettable \
python3dist(palettable)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
