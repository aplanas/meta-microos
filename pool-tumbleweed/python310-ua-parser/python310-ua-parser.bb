SUMMARY = "Python Implementation of UA Parser"
DESCRIPTION = "A python implementation of the UA Parser (https://github.com/ua-parser, formerly \
https://github.com/tobie/ua-parser)"
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python310-ua-parser-0.16.1-1.4.noarch.rpm"
RPM_HASH = "d0a906d828dc0b379873826611fe65ab8f0454f8dc362ef455490c673827bad930e8c0554794005853bdb495540d09d1b0247fbb9d49e9cb1b8d1e53095666bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ua-parser \
python310-ua-parser \
python3dist-ua-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
