SUMMARY = "Binary files of tex4ebook"
DESCRIPTION = "Binary files of tex4ebook"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37771"

RPM_NAME = "texlive-tex4ebook-bin-2023.20230311.svn37771-93.1.aarch64.rpm"
RPM_HASH = "12327b690cf3e4ceadfdaf67de4442a37e1db0569d9852939b36fb7659a82e2f63deb8cb5f4b70bc8283b5610d424b9107827e165a68a80d414a17f8733d20f9"

RPROVIDES:${PN} += "texlive-tex4ebook-bin"

RDEPENDS:${PN} += "texlive-tex4ebook"

inherit rpm
