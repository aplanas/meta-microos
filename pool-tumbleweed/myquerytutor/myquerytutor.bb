SUMMARY = "Educational tool to teach SQL"
DESCRIPTION = "A personal tutor to teach you Structured Query Language."
LICENSE = "GPL-3.0"

PV = "2.1.1+git20201224.0172df6"

RPM_NAME = "myquerytutor-2.1.1+git20201224.0172df6-1.11.noarch.rpm"
RPM_HASH = "8dd7b15999d333fedd4d55fb9adb71d67106fabf1def00d52713d32250efd548f5e346feaa5dfcfae8797c040315cf271bec91fb60077aa5abb37a45e10fa932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "myquerytutor \
python3.11dist-myquerytutor \
python3dist-myquerytutor"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyQt5 \
python3-beautifulsoup4 \
python3-qtwebengine-qt5 \
python3-requests"

inherit rpm
