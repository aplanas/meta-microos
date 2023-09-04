SUMMARY = "Querying your filehandle's capabilities"
DESCRIPTION = "Perl's filehandles are implemented as a stack of layers, with the \
bottom-most usually doing the actual IO and the higher ones doing \
buffering, encoding/decoding or transformations. PerlIO::Layers allows you \
to query the filehandle's properties concerning these layers."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.012"

RPM_NAME = "perl-PerlIO-Layers-0.012-1.19.aarch64.rpm"
RPM_HASH = "f3a7173531e34d2e93a583813591045445e8cfa82a76ac8719cd0e68617a59f04bb916fe816f6af21085547c4a983f5a4f6b0bd09aedb82cf17df7cddf4cbdd5"

RPROVIDES:${PN} += "perl-PerlIO--Layers \
perl-PerlIO-Layers"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
