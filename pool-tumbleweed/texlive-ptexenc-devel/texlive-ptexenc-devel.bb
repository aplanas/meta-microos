SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "This package includes the ptexenc development files. \
The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "texlive-ptexenc-devel-1.4.3-92.1.aarch64.rpm"
RPM_HASH = "7d3051ff57d60b66b70fed800b04100f510ec7f5495e37dbc7da83ccab9bfc40fa044955a58ac5948068b01339aa44bca4958743561a2e96eb9b673e0884d0cb"

RPROVIDES:${PN} += "pkgconfig-ptexenc \
texlive-ptexenc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptexenc1 \
pkgconfig-kpathsea"

inherit rpm
