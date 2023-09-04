SUMMARY = "Binary files of epstopdf"
DESCRIPTION = "Binary files of epstopdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18336"

RPM_NAME = "texlive-epstopdf-bin-2023.20230311.svn18336-93.2.aarch64.rpm"
RPM_HASH = "32ca0adc4c0b5736643bb785851ad67f09bc4e1d29697b6d3434f1762d5a9d3c8ef3705f1a27fdb29cf29a35a137d2b6e809b331dcf34b9aebff8b29e6e35eb7"

RPROVIDES:${PN} += "texlive-epstopdf-bin"

RDEPENDS:${PN} += "texlive-epstopdf"

inherit rpm
