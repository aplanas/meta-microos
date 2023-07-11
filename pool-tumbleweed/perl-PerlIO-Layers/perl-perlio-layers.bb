SUMMARY = "Querying your filehandle's capabilities"
DESCRIPTION = "Perl's filehandles are implemented as a stack of layers, with the \
bottom-most usually doing the actual IO and the higher ones doing \
buffering, encoding/decoding or transformations. PerlIO::Layers allows you \
to query the filehandle's properties concerning these layers."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.012"

RPM_NAME = "perl-PerlIO-Layers-0.012-1.18.aarch64.rpm"
RPM_HASH = "8e4602282699f9d946cb292b0d4fd8e5d02f77b7dd56e9c52bd0846a07c92b976d3f073b18560e9c60f2511cdfdeabf94501dd647e38de89bf861d950039104e"

RPROVIDES:${PN} += "perl-PerlIO--Layers \
perl-PerlIO-Layers"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
