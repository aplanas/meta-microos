SUMMARY = "Flake8 Builtins plugin"
DESCRIPTION = "This plugin checks for Python builtins being used as variables or parameters."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "python310-flake8-builtins-2.1.0-1.3.noarch.rpm"
RPM_HASH = "62ed3c194367509ace8dec10d6ba835d65cc97ee881175a4643b9c5da339c54cccd534e078717882aba901c29c176776246251b3000234ed184559f858bd47dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-builtins \
python3.10dist(flake8-builtins) \
python310-flake8-builtins \
python3dist(flake8-builtins)"

RDEPENDS:${PN} += "python(abi) \
python310-flake8"

inherit rpm
