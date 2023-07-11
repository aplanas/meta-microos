SUMMARY = "A C++ utility library"
DESCRIPTION = "This contains the shared libraries for folly, a C++ utility library developed \
at Facebook."
LICENSE = "MIT"

PV = "2023.05.01.00"

RPM_NAME = "libfolly-v2023_05_01_00-2023.05.01.00-1.2.aarch64.rpm"
RPM_HASH = "a199ea9f4ef8956a1201baa37b271a5346b5ae0db51bef2792eff18e75bca38a38475ddb5cfd50002feb90077d87d3b79b76246379ffdb299993b4d2f7d4e987"

RPROVIDES:${PN} += "libfolly-exception-counter.so.v2023.05.01.00 \
libfolly-exception-tracer-base.so.v2023.05.01.00 \
libfolly-exception-tracer.so.v2023.05.01.00 \
libfolly-test-util.so.v2023.05.01.00 \
libfolly-v2023-05-01-00 \
libfolly.so.v2023.05.01.00 \
libfollybenchmark.so.v2023.05.01.00"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libboost-context.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdouble-conversion.so.3 \
libevent-2.1.so.7 \
libfmt.so.9 \
libgcc-s.so.1 \
libgflags.so.2.2 \
libglog.so.0 \
liblz4.so.1 \
liblzma.so.5 \
libm.so.6 \
libsnappy.so.1 \
libsodium.so.23 \
libssl.so.3 \
libstdc++.so.6 \
libunwind.so.8 \
liburing.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
