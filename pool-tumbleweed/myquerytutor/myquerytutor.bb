SUMMARY = "Educational tool to teach SQL"
DESCRIPTION = "A personal tutor to teach you Structured Query Language."
LICENSE = "GPL-3.0"

PV = "2.1.1+git20201224.0172df6"

RPM_NAME = "myquerytutor-2.1.1+git20201224.0172df6-1.10.noarch.rpm"
RPM_HASH = "91adb855761b8f238a830764162c78975ef9dd3928dc89594c86bd8ba94db61a3b1a536c20dc4e978a3738c658431110d2a45a38c9b80f8cd60a3fee1ab2339a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "myquerytutor \
python3.10dist-myquerytutor \
python3dist-myquerytutor"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyQt5 \
python3-beautifulsoup4 \
python3-qtwebengine-qt5 \
python3-requests"

inherit rpm
