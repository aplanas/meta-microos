SUMMARY = "Marathon Client Library"
DESCRIPTION = "Python interface to the Mesos Marathon REST API."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python310-marathon-0.13.0-2.6.noarch.rpm"
RPM_HASH = "90a2afea83f28cfab202339bead8d0ceb99b9658c5d130f304582d8493543b200c4eef975edec00afbb8f87eebd0f0e1b7a0355183317a2055bc389ab594708d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-marathon \
python3.10dist-marathon \
python310-marathon \
python3dist-marathon"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-requests-toolbelt"

inherit rpm
