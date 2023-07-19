SUMMARY = "Binary files of pst2pdf"
DESCRIPTION = "Binary files of pst2pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29333"

RPM_NAME = "texlive-pst2pdf-bin-2023.20230311.svn29333-93.1.aarch64.rpm"
RPM_HASH = "d035891998207b8fbb991f5f324f08e0ca425feff20e8c93fe179ef80f40c27a291ddf3ecdfc12582ccbdeba02274be4fc87a7fa320eee6f254ef3815aa0c098"

RPROVIDES:${PN} += "texlive-pst2pdf-bin"

RDEPENDS:${PN} += "texlive-pst2pdf"

inherit rpm
