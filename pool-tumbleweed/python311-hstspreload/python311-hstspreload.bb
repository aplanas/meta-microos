SUMMARY = "Python Chromium HSTS Preload list"
DESCRIPTION = "Chromium HSTS Preload list as a Python package."
LICENSE = "BSD-3-Clause"

PV = "2023.1.1"

RPM_NAME = "python311-hstspreload-2023.1.1-1.5.noarch.rpm"
RPM_HASH = "bd775f63335f512480193b76c621b1fc92a4900c69870bc17df90f40d108f60135d26025b97bc25d699b919ddf445931f52cda36fafa3fc4e9fdaa3d624081c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hstspreload \
python3.11dist-hstspreload \
python311-hstspreload \
python3dist-hstspreload"

RDEPENDS:${PN} += "python-abi"

inherit rpm
