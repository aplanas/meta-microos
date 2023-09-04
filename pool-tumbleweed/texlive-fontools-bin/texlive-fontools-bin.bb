SUMMARY = "Binary files of fontools"
DESCRIPTION = "Binary files of fontools"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25997"

RPM_NAME = "texlive-fontools-bin-2023.20230311.svn25997-93.2.aarch64.rpm"
RPM_HASH = "60966a01b0c0d3919397c147f564da038611239b76d5394fee21a1346d061b04fbf532740bfde7d11d2151fb23c0ec3dad94b4ae75e750b9f3aaee5387ac68b8"

RPROVIDES:${PN} += "texlive-fontools-bin"

RDEPENDS:${PN} += "texlive-fontools"

inherit rpm
