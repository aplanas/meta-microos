SUMMARY = "Python library to apply true color for terminal text"
DESCRIPTION = "A Python library to apply true color for terminal text."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-tcolorpy-0.1.2-1.5.noarch.rpm"
RPM_HASH = "ffa240855638372473b3d1593532a874a6fc87adb82fda8e4eac802d4becd9b6a5352b2b812fc12d615455eda0df7b4502d670048826ab4054e1b19d1e4f1af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tcolorpy \
python3.11dist-tcolorpy \
python311-tcolorpy \
python3dist-tcolorpy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
