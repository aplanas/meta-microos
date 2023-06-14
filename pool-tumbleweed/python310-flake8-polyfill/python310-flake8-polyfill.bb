SUMMARY = "Polyfill package for Flake8 plugins"
DESCRIPTION = "Flake8-polyfill is a package that provides some compatibility helpers for \
Flake8 plugins that intend to support Flake8 2.x and 3.x simultaneously."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-flake8-polyfill-1.0.2-3.8.noarch.rpm"
RPM_HASH = "10b8d8d1f62cbc396caa3e9c31f4db59f01a732c30f56600e3261f6937ab9904d4ba74ef8b89d10e0426f35e343c483a1af896a2e3373c203768ca152bfe96b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-polyfill \
python3.10dist-flake8-polyfill \
python310-flake8-polyfill \
python3dist-flake8-polyfill"

RDEPENDS:${PN} += "python-abi \
python310-flake8"

inherit rpm
