SUMMARY = "A high-level Python Screen Scraping framework"
DESCRIPTION = "Scrapy is a high level scraping and web crawling framework for writing spiders \
to crawl and parse web pages for all kinds of purposes, from information \
retrieval to monitoring or testing web sites."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "python311-Scrapy-2.7.1-1.5.noarch.rpm"
RPM_HASH = "5d6aa03bcc4ba36f9a57860b07957cb53d79691594c4de057a16f6a365fef035d27eb0648eb920c1c53757cf65848742bd5dd3a788187d70823bc79183cc1671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-scrapy \
python311-Scrapy \
python3dist-scrapy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Protego \
python311-PyDispatcher \
python311-Twisted \
python311-cryptography \
python311-cssselect \
python311-itemadapter \
python311-itemloaders \
python311-lxml \
python311-parsel \
python311-pyOpenSSL \
python311-queuelib \
python311-service-identity \
python311-setuptools \
python311-tldextract \
python311-w3lib \
python311-zope.interface \
update-alternatives"

inherit rpm
