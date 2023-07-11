SUMMARY = "Binary files of srcredact"
DESCRIPTION = "Binary files of srcredact"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38710"

RPM_NAME = "texlive-srcredact-bin-2023.20230311.svn38710-92.1.aarch64.rpm"
RPM_HASH = "1c3178282025323f7176bd19f906b8754633703d46d3cc1aaf5a9a63245ff01db8e3c2159a73dd2bd74dc7c937e26b80d51c9af7f4f1c9f09bcdd512311ad332"

RPROVIDES:${PN} += "texlive-srcredact-bin"

RDEPENDS:${PN} += "texlive-srcredact"

inherit rpm
