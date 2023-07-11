SUMMARY = "PDF Generator Using HTML and CSS"
DESCRIPTION = "xhtml2pdf is a html2pdf converter using the ReportLab Toolkit, the HTML5lib and \
pyPdf. It supports HTML 5 and CSS 2.1 (and some of CSS 3). It is completely \
written in pure Python so it is platform independent. \
 \
The main benefit of this tool that a user with Web skills like HTML and CSS is \
able to generate PDF templates very quickly without learning new technologies."
LICENSE = "Apache-2.0"

PV = "0.2.6"

RPM_NAME = "python39-xhtml2pdf-0.2.6-1.6.noarch.rpm"
RPM_HASH = "a828719da1a233c3def0168c7a2921afd5d59e11bf840e5380b0d475e1912473d5e274a25912ba2cc9652b400788f7ed7717bd65bcca4d3b9c30a5179ad831a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xhtml2pdf \
python39-xhtml2pdf \
python3dist-xhtml2pdf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pillow \
python39-PyPDF3 \
python39-arabic-reshaper \
python39-html5lib \
python39-python-bidi \
python39-reportlab \
python39-setuptools \
update-alternatives"

inherit rpm
