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

RPM_NAME = "frescobaldi-3.3.0-1.1.noarch.rpm"
RPM_HASH = "e010f204d024a5464746a53ee2230654eb38a30d2d4213096373843cfff35ef7733c6334db2e02a297f70cd0dcfad47fabb265a81b4a4e9dbd6b6fe4a6db0cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.frescobaldi.Frescobaldi.desktop) frescobaldi metainfo() metainfo(org.frescobaldi.Frescobaldi.metainfo.xml) mimehandler(text/x-lilypond) python3.10dist(frescobaldi) python3.10dist(python-ly) python3dist(frescobaldi) python3dist(python-ly)"
RDEPENDS:${PN} += "/usr/bin/python3 lilypond python(abi) python3-poppler-qt5 python3-qpageview python3-qt5 python3-qt5-sip python3-qtwebengine-qt5"

inherit rpm
