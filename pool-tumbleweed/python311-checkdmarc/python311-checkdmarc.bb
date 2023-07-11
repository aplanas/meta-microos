SUMMARY = "A Python module and command line parser for SPF and DMARC records"
DESCRIPTION = "A Python module and command line parser for SPF and DMARC records."
LICENSE = "Apache-2.0"

PV = "4.4.1"

RPM_NAME = "python311-checkdmarc-4.4.1-1.10.noarch.rpm"
RPM_HASH = "a52887acd997811476b7793d848c5df7ff05b7152f68de54173a02efb3623789f8dc372ba98fb041cb6070636ef14de11074e19cab0f2a65ec2e1163290f646c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-checkdmarc \
python3.11dist-checkdmarc \
python311-checkdmarc \
python3dist-checkdmarc"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dnspython \
python311-expiringdict \
python311-publicsuffix2 \
python311-pyleri \
python311-requests \
python311-timeout-decorator"

inherit rpm
