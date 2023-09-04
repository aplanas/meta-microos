SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-html-2.0.3-1.2.noarch.rpm"
RPM_HASH = "f634d3a1dbc1e9e60b0ce9014ff184ac7393e89789bef242d33fa281b30fa4af38ab90bef0576245c36e0ed73ca8596ac299cd7a126a50a8ec1c6e8b8a5d37b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-html"

RDEPENDS:${PN} += "python310-beautifulsoup4 \
python310-html5lib \
python310-lxml \
python310-pandas"

inherit rpm
