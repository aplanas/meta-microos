SUMMARY = "A high-level Python Screen Scraping framework"
DESCRIPTION = "Scrapy is a high level scraping and web crawling framework for writing spiders \
to crawl and parse web pages for all kinds of purposes, from information \
retrieval to monitoring or testing web sites."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "python311-Scrapy-2.7.1-1.7.noarch.rpm"
RPM_HASH = "ffa1e3f99aaca589590fd523f13327877b2f846addb43e72e538d1067df4494414fa43cda9c65972210c5878d4e5461e2c84ccc4878e44f5a1bc3f045ecb76b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Scrapy \
python3.11dist-scrapy \
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
