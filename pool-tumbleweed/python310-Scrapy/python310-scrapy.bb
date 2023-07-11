SUMMARY = "A high-level Python Screen Scraping framework"
DESCRIPTION = "Scrapy is a high level scraping and web crawling framework for writing spiders \
to crawl and parse web pages for all kinds of purposes, from information \
retrieval to monitoring or testing web sites."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "python310-Scrapy-2.7.1-1.7.noarch.rpm"
RPM_HASH = "5816949a4558ec33c6d8e2841ce349bf15bec77e16a249c41d2bbad882716241e4e9a282c9688082a2b169d19ddc499b2b4a1724e05e0a554340bdc3d27a0ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scrapy \
python310-Scrapy \
python3dist-scrapy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Protego \
python310-PyDispatcher \
python310-Twisted \
python310-cryptography \
python310-cssselect \
python310-itemadapter \
python310-itemloaders \
python310-lxml \
python310-parsel \
python310-pyOpenSSL \
python310-queuelib \
python310-service-identity \
python310-setuptools \
python310-tldextract \
python310-w3lib \
python310-zope.interface \
update-alternatives"

inherit rpm
