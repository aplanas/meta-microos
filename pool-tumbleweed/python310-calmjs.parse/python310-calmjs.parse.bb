SUMMARY = "Various parsers for ECMA standards"
DESCRIPTION = "A collection of parsers and helper libraries for understanding \
ECMAScript; a near feature complete fork of slimit."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-calmjs.parse-1.3.0-2.10.noarch.rpm"
RPM_HASH = "46d38490604889579711cbdde9ea54a348d513defbedd874baea4a446d5152f0f99635169afee6885899c1fec1d9175dc78c533190f989946aaa35947627d861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calmjs.parse \
python3.10dist(calmjs.parse) \
python310-calmjs.parse \
python3dist(calmjs.parse)"

RDEPENDS:${PN} += "python(abi) \
python310-ply \
python310-setuptools"

inherit rpm
