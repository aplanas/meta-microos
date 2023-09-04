SUMMARY = "Binary files of autosp"
DESCRIPTION = "Binary files of autosp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-autosp-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "23946e8d7b6536f536a92ebea3df549c425d6bf99cfae97fdb5f9489d690fb3c6b29e5e6811b4cb21c71fd3328b206fb41de9013c5919173ae8d08ee170ee519"

RPROVIDES:${PN} += "texlive-autosp-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-autosp"

inherit rpm
