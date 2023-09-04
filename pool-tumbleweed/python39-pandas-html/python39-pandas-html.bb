SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-html-2.0.3-1.2.noarch.rpm"
RPM_HASH = "e18c5d23771763a83c91f1439313aa68e2711fc4557ac96ed35e6c8ed8ddcad52869fa49be7dfc1ab7f1cd76cfce5b5e52158573784887d86413a4116181554b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-html"

RDEPENDS:${PN} += "python39-beautifulsoup4 \
python39-html5lib \
python39-lxml \
python39-pandas"

inherit rpm
