SUMMARY = "Python module for creating testable command-line interfaces"
DESCRIPTION = "Cleo allows you to create beautiful and testable command-line interfaces."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-cleo-2.0.1-2.3.noarch.rpm"
RPM_HASH = "8dbc4f3912682aef3abc8feb2969999ac7e932201ae6ae7783eaa504c908577d84af71fa3495e50d7d286562b893ce77e60392fc43f06924b64d543d82c422da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cleo \
python3.11dist-cleo \
python311-cleo \
python3dist-cleo"

RDEPENDS:${PN} += "python-abi \
python311-crashtest \
python311-pylev \
python311-rapidfuzz"

inherit rpm
