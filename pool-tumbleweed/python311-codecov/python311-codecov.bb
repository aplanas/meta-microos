SUMMARY = "Hosted coverage reports"
DESCRIPTION = "Hosted coverage reports for Github, Bitbucket and Gitlab."
LICENSE = "Apache-2.0"

PV = "2.1.13"

RPM_NAME = "python311-codecov-2.1.13-1.1.noarch.rpm"
RPM_HASH = "3ba6999bd211baf1dbb9098c3b15de4b2f4910e2f934152292d48aa570d559d46ec000b090665c71a57443d58572c239252f295bfaad93957ddfa841dc310ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-codecov \
python311-codecov \
python3dist-codecov"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-coverage \
python311-requests \
update-alternatives"

inherit rpm
