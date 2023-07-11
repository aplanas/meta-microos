SUMMARY = "The kitchen sink of Python functional utility libraries"
DESCRIPTION = "The kitchen sink of Python utility libraries for doing 'stuff' in a functional way. \
Based on the Lo-Dash Javascript library."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python39-pydash-5.1.0-1.8.noarch.rpm"
RPM_HASH = "57194bdaee441f5461bfe90f09aa2bd7c11e7c56c8076264c8a611baa5ea8f723cdde5399cd9f790a802c8334d89d7e3786d1391bc2d334e7fa209aa5124aef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydash \
python39-pydash \
python3dist-pydash"

RDEPENDS:${PN} += "python-abi"

inherit rpm
