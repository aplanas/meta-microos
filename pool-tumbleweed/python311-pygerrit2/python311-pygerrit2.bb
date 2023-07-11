SUMMARY = "Client library for interacting with Gerrit code review"
DESCRIPTION = "Client library for interacting with Gerrit code review rest api \
 \
Pygerrit2 provides a simple interface for clients to interact with \
Gerrit code review via its rest api. \
 \
See also: https://gerritcodereview.com/"
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python311-pygerrit2-2.0.15-1.8.noarch.rpm"
RPM_HASH = "ea7e1b2f256dd88c6493995ca1580cbd4455b747818f5971fee9a50a18fc8dcf9b02d3fa749f064711dc571d5827dd4b83ba81775e6ab9d7b1221bdff8b84d61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygerrit2 \
python3.11dist-pygerrit2 \
python311-pygerrit2 \
python3dist-pygerrit2"

RDEPENDS:${PN} += "python-abi \
python311-pbr \
python311-requests"

inherit rpm
