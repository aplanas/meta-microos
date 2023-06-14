SUMMARY = "OAuth2 credmon for HTCondor."
DESCRIPTION = "The OAuth2 credmon allows users to obtain credentials from configured \
OAuth2 endpoints and to use those credentials securely inside running jobs."
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-credmon-oauth-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "f3ce6eb9425e43963a456110ebbc128ae86d2f9ba55210c718053d23c8831ff9946e769e9bfde1a74bd633d8ca4e86384746faf99d0fe46ce3890e1f938a4389"

RPROVIDES:${PN} += "config-htcondor-credmon-oauth \
htcondor-credmon-oauth"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
htcondor \
httpd \
mod-wsgi \
python3-Flask \
python3-condor \
python3-cryptography \
python3-requests-oauthlib \
python3-scitokens \
python3-six"

inherit rpm
