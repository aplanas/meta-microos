SUMMARY = "Binary files of axodraw2"
DESCRIPTION = "Binary files of axodraw2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-axodraw2-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "2e49e59a609d963be307c043137c45b38a06374ca38c41b85707e6b01cd56e1006f38d68d3fc70b6fc80c616cd96cdcffc1cc2decbf11ad7c29211186350f3d7"

RPROVIDES:${PN} += "texlive-axodraw2-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-axodraw2"

inherit rpm
