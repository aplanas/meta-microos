SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.6"

RPM_NAME = "python311-rt-3.0.6-1.1.noarch.rpm"
RPM_HASH = "985713c2f2230d3395d60db22d9dbdace84dbe95ef78a470542f44579a8fbcb59e8ceb15af429998cf398367d0a25f5d0b67b0756dba1b091a0a4101e441e264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rt \
python3.11dist-rt \
python311-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-six"

inherit rpm
