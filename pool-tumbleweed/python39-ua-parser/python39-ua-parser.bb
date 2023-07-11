SUMMARY = "Python Implementation of UA Parser"
DESCRIPTION = "A python implementation of the UA Parser (https://github.com/ua-parser, formerly \
https://github.com/tobie/ua-parser)"
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python39-ua-parser-0.16.1-1.4.noarch.rpm"
RPM_HASH = "4bbf26e533832f296dd623b1593be547f0136a3bd95bd0dc3ac8da73691cd7f2eee043b19de70d64029bf7e802d64d681f74303bebd462ba13f4012f815cb607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ua-parser \
python39-ua-parser \
python3dist-ua-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
