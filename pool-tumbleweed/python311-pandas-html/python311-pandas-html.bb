SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-html-2.0.3-1.2.noarch.rpm"
RPM_HASH = "dc1f6157eaa549ba5bae53f5a0f889733b0b12bdc9a06103029eb7d3908979fdafbc619726b1911c9e280016492d7c6f08fffd919d421a824d57e8716d703f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-html \
python311-pandas-html"

RDEPENDS:${PN} += "python311-beautifulsoup4 \
python311-html5lib \
python311-lxml \
python311-pandas"

inherit rpm
