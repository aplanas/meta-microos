SUMMARY = "Query SUSE Public Cloud Info Service"
DESCRIPTION = "Query the SUSE Public Cloud Information Service REST API"
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "python3-susepubliccloudinfo-1.4.0-1.6.noarch.rpm"
RPM_HASH = "b200240d96d9eaf4c442a864ec918ed2de12748e4db751e43fe3ff512109b1163cbde129b981f291411cb13d12c624ac014e953e9d7ca031df6cdebe3999a16c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-susepubliccloudinfo \
python3-susepubliccloudinfo \
python3.11dist-susepubliccloudinfo \
python3dist-susepubliccloudinfo"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3 \
python3-docopt \
python3-lxml \
python3-requests"

inherit rpm
