SUMMARY = "Tool to convert between any document format supported by LibreOffice"
DESCRIPTION = "unoconv converts between any document format that LibreOffice understands. \
It uses LibreOffice's UNO bindings for non-interactive conversion of \
documents. \
 \
Supported document formats include: Open Document Text (.odt), \
Open Document Draw (.odd), Open Document Presentation (.odp), \
Open Document calc (.odc), MS Word (.doc), MS PowerPoint (.pps/.ppt), \
MS Excel (.xls), MS Office Open/OOXML (.xml), \
Portable Document Format (.pdf), DocBook (.xml), LaTeX (.ltx), \
HTML, XHTML, RTF, Docbook (.xml), GIF, PNG, JPG, SVG, BMP, EPS \
and many more..."
LICENSE = "GPL-2.0-only"

PV = "0.9.0"

RPM_NAME = "unoconv-0.9.0-1.10.noarch.rpm"
RPM_HASH = "0b98d3dc266769a52fb79a4553e772d10a361de35d9f79a4587b2f46a97a5e41b63af3caa9823c99d63aedf16686f46f8aafbdea2cfab729ed1e992f467970d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unoconv"

RDEPENDS:${PN} += "/usr/bin/python3 \
libreoffice-pyuno \
python3"

inherit rpm
