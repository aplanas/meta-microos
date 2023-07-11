SUMMARY = "Base library for scrapy's ItemLoader"
DESCRIPTION = "Library to populate items using XPath and CSS with a convenient API"
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python310-itemloaders-1.0.6-1.5.noarch.rpm"
RPM_HASH = "bbde08d28fb5a3ac6efa94bd5fee8ac85bb6c64e44c8b05bf6585e4b3b99ac815b89389811b717b90cddb786cc068ffdd953a79934351b4a0491ed60e77a92a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-itemloaders \
python310-itemloaders \
python3dist-itemloaders"

RDEPENDS:${PN} += "python-abi \
python310-itemadapter \
python310-jmespath \
python310-parsel \
python310-w3lib"

inherit rpm
