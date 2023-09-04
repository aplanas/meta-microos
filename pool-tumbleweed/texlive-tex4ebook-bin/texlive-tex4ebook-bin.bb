SUMMARY = "Binary files of tex4ebook"
DESCRIPTION = "Binary files of tex4ebook"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37771"

RPM_NAME = "texlive-tex4ebook-bin-2023.20230311.svn37771-93.2.aarch64.rpm"
RPM_HASH = "c52378b8940de2477b307b551ea7b06223709c59fc16957c7525fce43a32712d9e9e218f08df166d8739a3febe4cac0103db64f2c3cef1a3cbbddf5c1e06eeac"

RPROVIDES:${PN} += "texlive-tex4ebook-bin"

RDEPENDS:${PN} += "texlive-tex4ebook"

inherit rpm
