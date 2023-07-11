SUMMARY = "Okta login without API token"
DESCRIPTION = "This modules provides a way for scripts to access resources behind \
an Okta SSO solution, without the need for an API token."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-oktaloginwrapper-0.2.2-2.9.noarch.rpm"
RPM_HASH = "9561cc740a22748a698b23f34c67509dafc28c23770f336236b48c50d4e25455237a768a842f607fefd3990eadda839a07e902af0d648aaba18a30c5455456ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oktaloginwrapper \
python3.11dist-oktaloginwrapper \
python311-oktaloginwrapper \
python3dist-oktaloginwrapper"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-requests"

inherit rpm
