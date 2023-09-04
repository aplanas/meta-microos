SUMMARY = "Binary files of detex"
DESCRIPTION = "Binary files of detex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-detex-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "526c9ecc53525f059e89422722f2d5bbec96452f4bbb97c653fe95bd6119cfc010c79ba7a8a959f20ca2cc0024807ab269799bd13e8de4c3a207dcd44d877525"

RPROVIDES:${PN} += "texlive-detex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-detex"

inherit rpm
