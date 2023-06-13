SUMMARY = "Converting Djvu Files to PDF Files"
DESCRIPTION = "A small tool to convert Djvu files to PDF files. Works on Linux, BSD and MacOS."
LICENSE = "GPL-2.0+ | LGPL-2.0+"

PV = "0.9.2"

RPM_NAME = "djvu2pdf-0.9.2-9.16.noarch.rpm"
RPM_HASH = "72477856588ea42bf28eea34a193635016cb7c0fd082a154c00e82eb40622988b88c5467245c4e9229bc8ae27b6894154a4830f1caa77044a52936f5ffe0b335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "djvu2pdf"

RDEPENDS:${PN} += "/bin/sh \
djvulibre \
ghostscript-library"

inherit rpm
