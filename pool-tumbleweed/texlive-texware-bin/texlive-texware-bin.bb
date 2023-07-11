SUMMARY = "Binary files of texware"
DESCRIPTION = "Binary files of texware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-texware-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "03e9a93d7637453d656c9a058d4ed84a9ca17966d0d102edb711b4694c291299b59a608f996c67bfc4c25f862de2b8f3e773c9511ff7d06434353f1cb7d1f2cd"

RPROVIDES:${PN} += "texlive-texware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-texware"

inherit rpm
