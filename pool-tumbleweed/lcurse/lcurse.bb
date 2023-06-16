SUMMARY = "Python script to have a 'curse' compatible client for linux"
DESCRIPTION = "Python script to have a 'curse' compatible client for linux. \
 \
In this context curse refers to the curse.com addon database for World of \
Warcraft."
LICENSE = "Unlicense"

PV = "1.0.0"

RPM_NAME = "lcurse-1.0.0-1.15.noarch.rpm"
RPM_HASH = "0ef64e1e7ad94d9e958caa0567f6030b6a61dbfdec2319285b9f5976ab76db06deb4b14bfe08fee3a5ad8a8e35d4cbac6cdb80c6df2dfbdd7c1734c475757ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lcurse"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-beautifulsoup4 \
python3-lxml \
python3-qt5"

inherit rpm
