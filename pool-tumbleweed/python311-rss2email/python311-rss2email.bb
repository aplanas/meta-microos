SUMMARY = "Receive RSS feeds by email"
DESCRIPTION = "Lets users receive news from RSS feeds in email. Intended to be run from \
a crontab, watches RSS feeds and sends formatted email messages for new \
items."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.14"

RPM_NAME = "python311-rss2email-3.14-1.6.noarch.rpm"
RPM_HASH = "80b348b2658f9c38f821666f17073a52a23b40cad707133b8e875789b542a0e61ffdf0043d503a41afafb49880eb2113051f85135bfed0012cef5fe4668a3682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rss2email \
python3.11dist-rss2email \
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
