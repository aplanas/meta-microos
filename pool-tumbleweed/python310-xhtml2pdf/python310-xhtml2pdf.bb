SUMMARY = "PDF Generator Using HTML and CSS"
DESCRIPTION = "xhtml2pdf is a html2pdf converter using the ReportLab Toolkit, the HTML5lib and \
pyPdf. It supports HTML 5 and CSS 2.1 (and some of CSS 3). It is completely \
written in pure Python so it is platform independent. \
 \
The main benefit of this tool that a user with Web skills like HTML and CSS is \
able to generate PDF templates very quickly without learning new technologies."
LICENSE = "Apache-2.0"

PV = "0.2.6"

RPM_NAME = "python310-xhtml2pdf-0.2.6-1.6.noarch.rpm"
RPM_HASH = "7592e541b806431bbfbdf9eb8bcac538125d417a755924e9feb0c8c041a5803876df23ce7dab03e94d9338c46986cff0638694e4bc5f84dcf3c5f9acfc469bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xhtml2pdf \
python310-xhtml2pdf \
python3dist-xhtml2pdf"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pillow \
python310-PyPDF3 \
python310-arabic-reshaper \
python310-html5lib \
python310-python-bidi \
python310-reportlab \
python310-setuptools \
update-alternatives"

inherit rpm
