SUMMARY = "Binary files of pst-pdf"
DESCRIPTION = "Binary files of pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn7838"

RPM_NAME = "texlive-pst-pdf-bin-2023.20230311.svn7838-93.1.aarch64.rpm"
RPM_HASH = "882ef3e257bb8e9adac3f59a690eeb04dc5ba435a6af6e6ce8bc2faf803dc92eb34c48cac4ee9fa075c4ccad18c87e8b44893294ae4a7b80dfeb5127becf807b"

RPROVIDES:${PN} += "texlive-pst-pdf-bin"

RDEPENDS:${PN} += "texlive-pst-pdf"

inherit rpm
