SUMMARY = "Binary files of hyperxmp"
DESCRIPTION = "Binary files of hyperxmp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn56984"

RPM_NAME = "texlive-hyperxmp-bin-2023.20230311.svn56984-92.1.aarch64.rpm"
RPM_HASH = "6044237564baf93ff9457a7ca591f993c2fbdd66f5ace459a076f4d5ed3f2bdb038320dd9e146cc7a28f98e46a42d90e70078b41caaaad6b122e51fb79500ea2"

RPROVIDES:${PN} += "texlive-hyperxmp-bin"

RDEPENDS:${PN} += "texlive-hyperxmp"

inherit rpm
