SUMMARY = "Various parsers for ECMA standards"
DESCRIPTION = "A collection of parsers and helper libraries for understanding \
ECMAScript; a near feature complete fork of slimit."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-calmjs.parse-1.3.0-3.1.noarch.rpm"
RPM_HASH = "a63368a33f9a466a634c961e9fd5eaeafeb7fb16a50de1e089458b5af0915880c23bb3b1bec30b494316c5cefc704c88a7e7c56fc94ad6db5031c03ad799661b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-calmjs.parse \
python310-calmjs.parse \
python3dist-calmjs.parse"

RDEPENDS:${PN} += "python-abi \
python310-ply \
python310-setuptools"

inherit rpm
