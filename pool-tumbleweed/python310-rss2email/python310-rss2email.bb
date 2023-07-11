SUMMARY = "Receive RSS feeds by email"
DESCRIPTION = "Lets users receive news from RSS feeds in email. Intended to be run from \
a crontab, watches RSS feeds and sends formatted email messages for new \
items."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.14"

RPM_NAME = "python310-rss2email-3.14-1.6.noarch.rpm"
RPM_HASH = "24428e85489bef48ea30827ed47d03191da42e5f3808a8d8a860285566be19caeab4bdcbe680a639fae8bed450325f6eccdfc185933928dab221d876c54996c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rss2email \
python310-rss2email \
python3dist-rss2email"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python3.10dist-feedparser \
python3.10dist-html2text \
python310-feedparser \
python310-html2text \
python310-setuptools \
update-alternatives"

inherit rpm
