SUMMARY = "Parallel bzip2/bunzip2 Filter"
DESCRIPTION = "Lbzip2 is a Pthreads-based parallel bzip2/bunzip2 filter, passable to \
GNU tar with the --use-compress-program option. \
 \
It isn't restricted to regular files on input, nor output. Successful \
splitting for decompression isn't guaranteed, just very likely \
(failure is detected). Splitting in both modes and compression itself \
occur with an approximate 900k block size. \
 \
On an Athlon-64 X2 6000+, lbzip2 was 92% faster than standard bzip2 \
when compressing, and 45% faster when decompressing (based on wall \
clock time). \
 \
Lbzip2 strives to be portable by requiring UNIX 98 APIs only, besides \
an unmodified libbz2."
LICENSE = "GPL-3.0-or-later"

PV = "2.5"

RPM_NAME = "lbzip2-2.5-7.9.aarch64.rpm"
RPM_HASH = "4398e944778237d16a40e863905c098427053a8c178162a1c3faed8b2987734f516453d91e5a3c94d1a7c867f29fe7228fbe6f3a6ffe031e89a5f2d58ebf0df3"

RPROVIDES:${PN} += "lbunzip2 \
lbzip2 \
lbzip2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
