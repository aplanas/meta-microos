SUMMARY = "A high-level Python Screen Scraping framework"
DESCRIPTION = "Scrapy is a high level scraping and web crawling framework for writing spiders \
to crawl and parse web pages for all kinds of purposes, from information \
retrieval to monitoring or testing web sites."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "python39-Scrapy-2.7.1-1.7.noarch.rpm"
RPM_HASH = "d195db1e98783248a339ab503d44561a51bf073171e3fa20569cb2b6800dad3021f0bfdfc71593c88d1839e126e5b92d99a1b3b9545688ae992eb680d3fb5af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scrapy \
python39-Scrapy \
python3dist-scrapy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Protego \
python39-PyDispatcher \
python39-Twisted \
python39-cryptography \
python39-cssselect \
python39-itemadapter \
python39-itemloaders \
python39-lxml \
python39-parsel \
python39-pyOpenSSL \
python39-queuelib \
python39-service-identity \
python39-setuptools \
python39-tldextract \
python39-w3lib \
python39-zope.interface \
update-alternatives"

inherit rpm
