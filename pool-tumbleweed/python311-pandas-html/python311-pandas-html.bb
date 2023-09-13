SUMMARY = "The python pandas[html] extra"
DESCRIPTION = "This package provides the [html] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-html-2.1.0-1.2.noarch.rpm"
RPM_HASH = "e4615da6628ea09dfd5713eedb7e0b3b1e7bd462297b18e7b12dff9ae8f6a5db0c0436280027a981f9287ca0fa82b2b332c7705aeb02e8794d74b9d100b9dda7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-html \
python311-pandas-html"

RDEPENDS:${PN} += "python311-beautifulsoup4 \
python311-html5lib \
python311-lxml \
python311-pandas"

inherit rpm
