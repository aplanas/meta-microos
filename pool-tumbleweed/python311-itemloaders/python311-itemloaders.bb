SUMMARY = "Base library for scrapy's ItemLoader"
DESCRIPTION = "Library to populate items using XPath and CSS with a convenient API"
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python311-itemloaders-1.0.6-1.5.noarch.rpm"
RPM_HASH = "74ac316ba75673132410bcd5da7b5ee77a47e39dcae67dd93efa3a15590821f3d1b50abb29e9bb86d9703f44ed80c9e2662fcd46dcc80e141521be8ce79cafe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-itemloaders \
python3.11dist-itemloaders \
python311-itemloaders \
python3dist-itemloaders"

RDEPENDS:${PN} += "python-abi \
python311-itemadapter \
python311-jmespath \
python311-parsel \
python311-w3lib"

inherit rpm
