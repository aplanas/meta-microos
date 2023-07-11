SUMMARY = "Lilypond editor"
DESCRIPTION = "Frescobaldi is a LilyPond sheet music editor. It aims to be powerful, yet \
lightweight and easy to use. \
 \
You can edit LilyPond documents and build and preview them with a mouse click. \
Clicking on notes in the PDF preview places the text cursor in the right place. \
A score wizard is provided to quickly setup a music score. There are editing \
tools to manipulate the rhythm, acticulations, lyrics hyphenation, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.0"

RPM_NAME = "frescobaldi-3.3.0-2.1.noarch.rpm"
RPM_HASH = "025bb1018db89a798903ccffeb137b7e5775be8d040a4073916d44ec744eb686cfeaf4d66763fdfc76ae6e75f3785f0778d07c668a2b7008e2a3d53aab2ff8a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frescobaldi \
python3.11dist-frescobaldi \
python3dist-frescobaldi"

RDEPENDS:${PN} += "/usr/bin/python3 \
lilypond \
python-abi \
python3-ly \
python3-poppler-qt5 \
python3-qpageview \
python3-qt5 \
python3-qt5-sip \
python3-qtwebengine-qt5"

inherit rpm
