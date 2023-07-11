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

RPM_NAME = "lbzip2-2.5-7.10.aarch64.rpm"
RPM_HASH = "df838fce59461ec61e6318561d8ed5a806fa2f3bab339d1f83cae880e7d7ac2d694e966718e9a04de22535398f2c83d86220448abdb5a57ecad45f2f1a3d9261"

RPROVIDES:${PN} += "lbunzip2 \
lbzip2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
