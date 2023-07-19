SUMMARY = "Binary files of thumbpdf"
DESCRIPTION = "Binary files of thumbpdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn6898"

RPM_NAME = "texlive-thumbpdf-bin-2023.20230311.svn6898-93.1.aarch64.rpm"
RPM_HASH = "e67fe198889004124fccbb1cf1ed1a3216869cfce27dbc6d38d9353d86bace3964f7f6adf60bd1c0f852d7195fa52c6edad401ec1f2cb5e4854676d6aad74b97"

RPROVIDES:${PN} += "texlive-thumbpdf-bin"

RDEPENDS:${PN} += "texlive-thumbpdf"

inherit rpm
