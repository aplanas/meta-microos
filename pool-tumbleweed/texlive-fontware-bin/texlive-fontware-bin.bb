SUMMARY = "Binary files of fontware"
DESCRIPTION = "Binary files of fontware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-fontware-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "ffc0705abff7bc3430fbd376db3d9cf4ebb0b9e9f3acfd3a41337428daae7a9295a6e336e123fd17d942a4449c79781ac0b09c2e79000932d8ce652916a240d5"

RPROVIDES:${PN} += "texlive-fontware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-fontware"

inherit rpm
