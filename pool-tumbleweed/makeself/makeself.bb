SUMMARY = "Make self-extractable archives on Unix"
DESCRIPTION = "Small shell script that generates a self-extractable tar.gz archive from a \
directory. The resulting file appears as a shell script (many of those \
have a .run suffix), and can be launched as is. The archive will then \
uncompress itself to a temporary directory and an optional arbitrary \
command will be executed (for example an installation script). \
 \
This is pretty similar to archives generated with WinZip Self-Extractor in \
the Windows world. Makeself archives also include checksums for integrity \
self-validation (CRC and/or MD5 checksums)."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.0"

RPM_NAME = "makeself-2.5.0-1.1.noarch.rpm"
RPM_HASH = "8feee08b677fb2614c46fe61a216616cdd6551eef0513b90ac7d2e2d2737150953fe32f81cd389384d3de762910320d05179dd93e5a3c31ae104e3d4bd471141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "makeself"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
