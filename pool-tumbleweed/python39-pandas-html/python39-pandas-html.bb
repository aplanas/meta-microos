SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-html-2.0.2-4.1.noarch.rpm"
RPM_HASH = "a5931f810c053997582e01ae1524f02c247e90a44af31d3f086d68ad4736f818dfbbc2b70bf865d08e436ae36ae55bfdded43c31f24ffdf1b2e8eb282fc4a969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-html"

RDEPENDS:${PN} += "python39-beautifulsoup4 \
python39-html5lib \
python39-lxml \
python39-pandas"

inherit rpm
