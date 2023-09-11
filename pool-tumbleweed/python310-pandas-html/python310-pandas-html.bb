SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-html-2.0.3-1.3.noarch.rpm"
RPM_HASH = "d4f86f8c5e051e8d679532439ad4dc10e321d43ab16470ef975b1f896901cd673b5b4a5a85b729cc6bf88b4933ab1ba3b3543b78b29939b03a1c150989119b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-html"

RDEPENDS:${PN} += "python310-beautifulsoup4 \
python310-html5lib \
python310-lxml \
python310-pandas"

inherit rpm
