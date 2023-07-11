SUMMARY = "Python L20n library"
DESCRIPTION = "L20n mozilla markings for translations. \
 \
Better solution today is to use python fluent module."
LICENSE = "Apache-2.0"

PV = "4.0.0a1"

RPM_NAME = "python311-l20n-4.0.0a1-2.4.noarch.rpm"
RPM_HASH = "7700f8c091dd32295044c4ac6cfe3a6e66d673492cd79502f81eecc81b531cf79a4f7632d3d5a5dfa9b5f4e049bed234becd9ff8203dcdaa1ceb0c6e03013a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-l20n \
python3.11dist-l20n \
python311-l20n \
python3dist-l20n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
