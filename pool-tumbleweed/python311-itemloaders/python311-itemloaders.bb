SUMMARY = "Base library for scrapy's ItemLoader"
DESCRIPTION = "Library to populate items using XPath and CSS with a convenient API"
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python311-itemloaders-1.0.6-1.3.noarch.rpm"
RPM_HASH = "4d9deb5477affff864b127312bc9814199ec8cbac362296f5c72529a37b94594b73a50fdc2e9b7cafbb851b88c24595b6fd83875e5cd9e4e422ce268a2002e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-itemloaders \
python311-itemloaders \
python3dist-itemloaders"

RDEPENDS:${PN} += "python-abi \
python311-itemadapter \
python311-jmespath \
python311-parsel \
python311-w3lib"

inherit rpm
