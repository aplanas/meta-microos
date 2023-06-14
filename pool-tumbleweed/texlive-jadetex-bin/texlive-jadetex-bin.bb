SUMMARY = "Binary files of jadetex"
DESCRIPTION = "Binary files of jadetex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-jadetex-bin-2023.20230311.svn3006-91.1.aarch64.rpm"
RPM_HASH = "07c5a8bb5850dc9594b78846b470c2a5be14741bf32dd5479599ee6448e2e22efb37ee0974e508bb1472663e63a350fd741de102f5e4cd851ef1b5ab63c55183"

RPROVIDES:${PN} += "texlive-jadetex-bin"

RDEPENDS:${PN} += "texlive-jadetex"

inherit rpm
