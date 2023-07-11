SUMMARY = "Base library for scrapy's ItemLoader"
DESCRIPTION = "Library to populate items using XPath and CSS with a convenient API"
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python39-itemloaders-1.0.6-1.5.noarch.rpm"
RPM_HASH = "d402dea48ddf58e80a51d0cd60171ddaf5c7e52d3311108afc38b1d9eb10b9aab2e2e597b2c8e3dc86fee0bfd532e452e0e98b3e964833bb8c92e0c88cd23252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-itemloaders \
python39-itemloaders \
python3dist-itemloaders"

RDEPENDS:${PN} += "python-abi \
python39-itemadapter \
python39-jmespath \
python39-parsel \
python39-w3lib"

inherit rpm
