SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-asdf-astropy-0.4.0-1.1.noarch.rpm"
RPM_HASH = "09ce06b3eceb9159cbc64b484f7e31041fb8e13189919cda57389f4b973991b0b74d9b75a43e2db8c81923549774db562d689600745532a93baa026c0d322918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-asdf-astropy \
python311-asdf-astropy \
python3dist-asdf-astropy"

RDEPENDS:${PN} += "python-abi \
python311-asdf \
python311-asdf-coordinates-schemas \
python311-asdf-transform-schemas \
python311-astropy \
python311-numpy \
python311-packaging"

inherit rpm
