SUMMARY = "Binary files of latexpand"
DESCRIPTION = "Binary files of latexpand"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn27025"

RPM_NAME = "texlive-latexpand-bin-2023.20230311.svn27025-92.1.aarch64.rpm"
RPM_HASH = "05e241e20d4f2be0117e00cfe6f7989d737b27cc7c4d45e53a88255e08fec2217a79638ea5a60215f4365e1446d46cf5acef2d6bea630dc3cf23b45a56d058f0"

RPROVIDES:${PN} += "texlive-latexpand-bin"

RDEPENDS:${PN} += "texlive-latexpand"

inherit rpm
