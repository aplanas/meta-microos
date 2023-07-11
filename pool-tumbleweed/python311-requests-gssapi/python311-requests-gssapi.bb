SUMMARY = "A GSSAPI authentication handler for python-requests"
DESCRIPTION = "A GSSAPI authentication handler for python-requests"
LICENSE = "ISC"

PV = "1.2.3"

RPM_NAME = "python311-requests-gssapi-1.2.3-1.8.noarch.rpm"
RPM_HASH = "aeaf58099b25e825a7a3eb3cf8aa6e74426f749ea73018778c10ad3e96df9d280260b62906095c2df34f42b2d68b1cbc171c09bd31fb393ce482e516a70fdab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-gssapi \
python3.11dist-requests-gssapi \
python311-requests-gssapi \
python3dist-requests-gssapi"

RDEPENDS:${PN} += "python-abi \
python311-gssapi \
python311-requests"

inherit rpm
