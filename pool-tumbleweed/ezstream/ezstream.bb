SUMMARY = "Icecast media streaming client"
DESCRIPTION = "Ezstream is a command line source client for Icecast media streaming servers. \
 \
The basic mode of operation streams media files or data from standard \
input without reencoding and thus requires little resources. It can \
use various external transcoders and stream the result. Additional \
features include scriptable playlist and metadata handling. \
 \
Supported media formats for streaming are MP3, Ogg Vorbis and Ogg \
Theora. Native metadata support includes MP3 (ID3v1 only) and Ogg, \
plus all those known to TagLib."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "ezstream-1.0.2-1.8.aarch64.rpm"
RPM_HASH = "a7fb30897e29b717d9721093c97e42aea5a2227d2a59620583858bf901e77a1a4c4a2e540babf15441d60ca15f479de888f467c1c673bead598b4a43374ab95f"

RPROVIDES:${PN} += "ezstream \
ezstream(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libshout.so.3()(64bit) \
libtag_c.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
