SUMMARY = "A Python module and command line parser for SPF and DMARC records"
DESCRIPTION = "A Python module and command line parser for SPF and DMARC records."
LICENSE = "Apache-2.0"

PV = "4.4.1"

RPM_NAME = "python310-checkdmarc-4.4.1-1.8.noarch.rpm"
RPM_HASH = "6dfb6a149da33fb93ebd8d467c92ff3adb93dbb6572115770a80e0afc0affbc24d02ca3483b9d4cf0ac6bb5528ab32dee78b63f9c7d88a96670dd97719b7b477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-checkdmarc \
python3.10dist(checkdmarc) \
python310-checkdmarc \
python3dist(checkdmarc)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-dnspython \
python310-expiringdict \
python310-publicsuffix2 \
python310-pyleri \
python310-requests \
python310-timeout-decorator"

inherit rpm
