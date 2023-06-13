SUMMARY = "PDF Generator Using HTML and CSS"
DESCRIPTION = "xhtml2pdf is a html2pdf converter using the ReportLab Toolkit, the HTML5lib and \
pyPdf. It supports HTML 5 and CSS 2.1 (and some of CSS 3). It is completely \
written in pure Python so it is platform independent. \
 \
The main benefit of this tool that a user with Web skills like HTML and CSS is \
able to generate PDF templates very quickly without learning new technologies."
LICENSE = "Apache-2.0"

PV = "0.2.6"

RPM_NAME = "python39-xhtml2pdf-0.2.6-1.4.noarch.rpm"
RPM_HASH = "aaae669b1c89d3ab9739e729d9950c597bab691e6b026d71ed3af8012c54abc665b6df90f70b3e8941b00537bd81bf3bee2e216f59d9d301cc86adb9d770f9c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xhtml2pdf) \
python39-xhtml2pdf \
python3dist(xhtml2pdf)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Pillow \
python39-PyPDF3 \
python39-arabic-reshaper \
python39-html5lib \
python39-python-bidi \
python39-reportlab \
python39-setuptools \
update-alternatives"

inherit rpm
