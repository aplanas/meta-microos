SUMMARY = "Receive RSS feeds by email"
DESCRIPTION = "Lets users receive news from RSS feeds in email. Intended to be run from \
a crontab, watches RSS feeds and sends formatted email messages for new \
items."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.14"

RPM_NAME = "python310-rss2email-3.14-1.5.noarch.rpm"
RPM_HASH = "d3299d177b5244b893556b98a6f88d23573a6cf47682d9236baecb60dc506382d3dc0806201c9cefe30e9138e99870b704ebc38721f9de25636a68da905ee74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rss2email \
python3.10dist(rss2email) \
python310-rss2email \
python3dist(rss2email)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python3.10dist(feedparser) \
python3.10dist(html2text) \
python310-feedparser \
python310-html2text \
python310-setuptools \
update-alternatives"

inherit rpm
