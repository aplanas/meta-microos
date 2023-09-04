SUMMARY = "Binary files of dvicopy"
DESCRIPTION = "Binary files of dvicopy"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvicopy-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "592c62e92617b8b4dd6daedc7cd1d27a3b28cb45070840288ac0984a177070fd3ad473645a9d112535c3befc461ebd33f358e3ac10ccf76f7b733e4357228a1d"

RPROVIDES:${PN} += "texlive-dvicopy-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dvicopy"

inherit rpm
