SUMMARY = "Binary files of musixtnt"
DESCRIPTION = "Binary files of musixtnt"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-musixtnt-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "24e6eea4a1ae76ee99c1d470b3801dc3e108cef3979eaf0a6c7555666df723e383acfc69ad98396bc4c1ee9b4a164d1f90024e5a00c76608b063995e6f6c44a3"

RPROVIDES:${PN} += "texlive-musixtnt-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-musixtnt"

inherit rpm
