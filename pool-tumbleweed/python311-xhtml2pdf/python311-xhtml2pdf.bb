SUMMARY = "PDF Generator Using HTML and CSS"
DESCRIPTION = "xhtml2pdf is a html2pdf converter using the ReportLab Toolkit, the HTML5lib and \
pyPdf. It supports HTML 5 and CSS 2.1 (and some of CSS 3). It is completely \
written in pure Python so it is platform independent. \
 \
The main benefit of this tool that a user with Web skills like HTML and CSS is \
able to generate PDF templates very quickly without learning new technologies."
LICENSE = "Apache-2.0"

PV = "0.2.6"

RPM_NAME = "python311-xhtml2pdf-0.2.6-1.6.noarch.rpm"
RPM_HASH = "d54172a5cb366849c701b791672fdb5abd56b4ccad9444d72693464e42965581715ef64939500d64ddabb2d6aff28f1c751c5499c74bc9b50896f60cf8348d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xhtml2pdf \
python3.11dist-xhtml2pdf \
python311-xhtml2pdf \
python3dist-xhtml2pdf"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pillow \
python311-PyPDF3 \
python311-arabic-reshaper \
python311-html5lib \
python311-python-bidi \
python311-reportlab \
python311-setuptools \
update-alternatives"

inherit rpm
