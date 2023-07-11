SUMMARY = "Polyfill package for Flake8 plugins"
DESCRIPTION = "Flake8-polyfill is a package that provides some compatibility helpers for \
Flake8 plugins that intend to support Flake8 2.x and 3.x simultaneously."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-flake8-polyfill-1.0.2-3.10.noarch.rpm"
RPM_HASH = "d67eace07635ecf7730c70e38024d9d136c5231163dc56d5c3fca6de6e2bc9c0e11b2861e65773be8330e2823f7ea294539b513099ca71490cee8cdafb8f0da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-polyfill \
python39-flake8-polyfill \
python3dist-flake8-polyfill"

RDEPENDS:${PN} += "python-abi \
python39-flake8"

inherit rpm
