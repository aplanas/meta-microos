SUMMARY = "Polyfill package for Flake8 plugins"
DESCRIPTION = "Flake8-polyfill is a package that provides some compatibility helpers for \
Flake8 plugins that intend to support Flake8 2.x and 3.x simultaneously."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-flake8-polyfill-1.0.2-3.10.noarch.rpm"
RPM_HASH = "8777a36b04b8e4dd6333b59285f5d44fafc13a52bf479a9b10210b94b5e2b05ec4c60cc042070b7e129bd786b4803eed9ba74640d94bb620a4295eb11ef68c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-polyfill \
python310-flake8-polyfill \
python3dist-flake8-polyfill"

RDEPENDS:${PN} += "python-abi \
python310-flake8"

inherit rpm
