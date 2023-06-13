SUMMARY = "Python Implementation of UA Parser"
DESCRIPTION = "A python implementation of the UA Parser (https://github.com/ua-parser, formerly \
https://github.com/tobie/ua-parser)"
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python39-ua-parser-0.16.1-1.3.noarch.rpm"
RPM_HASH = "fc0fec693005f218221f0fa73e02aabcc74adc74992c66798561b3025bbff822ae78d62aff2f363bd77bc23904472361953eb1f95c8cd698f892da53dcbdd748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ua-parser) \
python39-ua-parser \
python3dist(ua-parser)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
