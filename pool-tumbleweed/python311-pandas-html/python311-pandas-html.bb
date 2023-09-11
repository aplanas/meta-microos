SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-html-2.0.3-1.3.noarch.rpm"
RPM_HASH = "c50b6b7412594656dd1130e279d35d86ebfe01da38820efe1580b4ade27549edf7dc734f55fe82cc0fa7613774d3b0ee7a4034589533380300165ea463c43673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-html \
python311-pandas-html"

RDEPENDS:${PN} += "python311-beautifulsoup4 \
python311-html5lib \
python311-lxml \
python311-pandas"

inherit rpm
