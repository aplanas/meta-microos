SUMMARY = "Binary files of de-macro"
DESCRIPTION = "Binary files of de-macro"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn17399"

RPM_NAME = "texlive-de-macro-bin-2023.20230311.svn17399-93.1.aarch64.rpm"
RPM_HASH = "24469e41c142187a01e31e7ca0d9e8fe107a54e8986b8a4667885c0e7808b0f0c2591aebc5eb1c8728dee33d7f3485a302aab238e540ec0b057f68ea07124f41"

RPROVIDES:${PN} += "texlive-de-macro-bin"

RDEPENDS:${PN} += "texlive-de-macro"

inherit rpm
