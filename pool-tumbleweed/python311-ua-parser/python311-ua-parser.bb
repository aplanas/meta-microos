SUMMARY = "Python Implementation of UA Parser"
DESCRIPTION = "A python implementation of the UA Parser (https://github.com/ua-parser, formerly \
https://github.com/tobie/ua-parser)"
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python311-ua-parser-0.16.1-1.4.noarch.rpm"
RPM_HASH = "1c294bf243853c1489a6d7b8c09bc109bf4cd3e813c8315f8a1e9c4ea2600a46d53ecaf4d27bdae3e396a96f9bf87cfa35aeac51cdd1c8845305b4b4b6cd6c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ua-parser \
python3.11dist-ua-parser \
python311-ua-parser \
python3dist-ua-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
