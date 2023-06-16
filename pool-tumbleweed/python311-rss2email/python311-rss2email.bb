SUMMARY = "Receive RSS feeds by email"
DESCRIPTION = "Lets users receive news from RSS feeds in email. Intended to be run from \
a crontab, watches RSS feeds and sends formatted email messages for new \
items."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.14"

RPM_NAME = "python311-rss2email-3.14-1.5.noarch.rpm"
RPM_HASH = "0eaa212e3a442d557dd65770ee554c7410aec638ca318b4cdb9a0280ab89cac83cb2a921ea3670b71fed0d3d9ebab9486f1c1fb81425bef7c7952f82c279755c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rss2email \
python311-rss2email \
python3dist-rss2email"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python3.11dist-feedparser \
python3.11dist-html2text \
python311-feedparser \
python311-html2text \
python311-setuptools \
update-alternatives"

inherit rpm
