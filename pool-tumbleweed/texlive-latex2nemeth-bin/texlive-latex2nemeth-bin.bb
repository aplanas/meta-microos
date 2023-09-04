SUMMARY = "Binary files of latex2nemeth"
DESCRIPTION = "Binary files of latex2nemeth"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn42300"

RPM_NAME = "texlive-latex2nemeth-bin-2023.20230311.svn42300-93.2.aarch64.rpm"
RPM_HASH = "64b9958cc35546c79156337f6b5cef0178dc5cb1a18d70a3cf7badc9e5f1dccd9fa2e1634d945b64c58ba7004c6f6f8ace8861e17ca6bb3fe930dde0d4706f31"

RPROVIDES:${PN} += "texlive-latex2nemeth-bin"

RDEPENDS:${PN} += "texlive-latex2nemeth"

inherit rpm
