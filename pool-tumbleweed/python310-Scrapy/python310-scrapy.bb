SUMMARY = "A high-level Python Screen Scraping framework"
DESCRIPTION = "Scrapy is a high level scraping and web crawling framework for writing spiders \
to crawl and parse web pages for all kinds of purposes, from information \
retrieval to monitoring or testing web sites."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "python310-Scrapy-2.7.1-1.5.noarch.rpm"
RPM_HASH = "772275f56dedd6581fe6d544e0f6276889e89ba430fa837087a3cf7df52d24998f91c1c1bc50e2805fbcb2fddb6b963c890edf8fd9e894efd0cfcdcc353650e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Scrapy \
python3.10dist-scrapy \
python310-Scrapy \
python3dist-scrapy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
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
