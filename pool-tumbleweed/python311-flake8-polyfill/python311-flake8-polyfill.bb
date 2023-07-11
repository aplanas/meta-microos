SUMMARY = "Polyfill package for Flake8 plugins"
DESCRIPTION = "Flake8-polyfill is a package that provides some compatibility helpers for \
Flake8 plugins that intend to support Flake8 2.x and 3.x simultaneously."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-flake8-polyfill-1.0.2-3.10.noarch.rpm"
RPM_HASH = "5c9b03532610e547bd4854d8e1e76278dfd9f6286af5cea040ee8970828c69c18874c8ff81ce933440af3ab281fa2c20a31972b1c769c7507f14a9ad134cd867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-polyfill \
python3.11dist-flake8-polyfill \
python311-flake8-polyfill \
python3dist-flake8-polyfill"

RDEPENDS:${PN} += "python-abi \
python311-flake8"

inherit rpm
