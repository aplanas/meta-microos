SUMMARY = "Receive RSS feeds by email"
DESCRIPTION = "Lets users receive news from RSS feeds in email. Intended to be run from \
a crontab, watches RSS feeds and sends formatted email messages for new \
items."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.14"

RPM_NAME = "python39-rss2email-3.14-1.6.noarch.rpm"
RPM_HASH = "712c690bed8b251578ae78740202f1e98252594670d69c1e19d53d338af15f407602d1f7eabeb3f1b28c176de82cb0666017300e088bb3327ad39061f1b75a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rss2email \
python39-rss2email \
python3dist-rss2email"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python3.9dist-feedparser \
python3.9dist-html2text \
python39-feedparser \
python39-html2text \
python39-setuptools \
update-alternatives"

inherit rpm
