SUMMARY = "A Python module and command line parser for SPF and DMARC records"
DESCRIPTION = "A Python module and command line parser for SPF and DMARC records."
LICENSE = "Apache-2.0"

PV = "4.4.1"

RPM_NAME = "python310-checkdmarc-4.4.1-1.10.noarch.rpm"
RPM_HASH = "87c0916050b7695577daa1b7955125833aced8ad2289a5d59aeeee0bf6f1346328374dffeba68bd2045d744fa9feb21db85035ed77a00aca3b2a99d693f9d426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-checkdmarc \
python310-checkdmarc \
python3dist-checkdmarc"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dnspython \
python310-expiringdict \
python310-publicsuffix2 \
python310-pyleri \
python310-requests \
python310-timeout-decorator"

inherit rpm
