SUMMARY = "PDF Processing Tools"
DESCRIPTION = "SetPDFMetadata updates the metadata of a PDF file. In particular, \
it can be used to add outlines (bookmarks) to a document. \
Furthermore, it can set the document properties (e.g. author, \
title, keywords, creator, producer).  PDFEmbedFonts embeds all \
referenced fonts into a PDF file. Optionally, it can also linearize \
the PDF file for online publication ('fast web view', 'optimized'). \
 \
This package contains tools for PDF file processing."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.4"

RPM_NAME = "netperfmeter-pdfproctools-1.9.4-1.1.noarch.rpm"
RPM_HASH = "010ba467a0da3f5b015a2ab1993e160435ada9bf75238f544a7efb0da896e22c8488a5ad1a14d7be27e6577a1a4820fa6513ff7cc6d9e8be2be71f70141c2d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netperfmeter-pdfproctools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ghostscript \
perl \
perl-PDF-API2 \
qpdf"

inherit rpm
