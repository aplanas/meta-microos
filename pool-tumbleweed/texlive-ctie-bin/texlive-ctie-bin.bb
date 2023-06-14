SUMMARY = "Binary files of ctie"
DESCRIPTION = "Binary files of ctie"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ctie-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "efa7e52851a4ef1793a77be8143342a1d5d099cd1449c477b8e4ce6de3ca156bcc4e62abeb30e45c7e782bd9d5c1c3ca494561ee4e34ddef7efdb34f630b7140"

RPROVIDES:${PN} += "texlive-ctie-bin"

RDEPENDS:${PN} += "libc.so.6 \
libkpathsea.so.6 \
texlive-ctie"

inherit rpm
