SUMMARY = "Marathon Client Library"
DESCRIPTION = "Python interface to the Mesos Marathon REST API."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python310-marathon-0.13.0-2.8.noarch.rpm"
RPM_HASH = "b49e25bfc32a788a9410a5cdb24a6304832377216fc616873f8cb5c9f87a266c5d3b1b0569a78ba055a9469c0887129c4f225f243eceecef1005130250c76a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-marathon \
python310-marathon \
python3dist-marathon"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-requests-toolbelt"

inherit rpm
