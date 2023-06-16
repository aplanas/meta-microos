SUMMARY = "PAPI runtime library"
DESCRIPTION = "This package contains the PAPI runtime library."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "libpapi-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "605047942eb8a6c7bddf51e9e33e1de037b5fee49a9deef213f5a1abb59b639f90464a2b37de4237d909a0f690fc80b2f6f2c5b5ae1e80e5887875cbfb7155f4"

RPROVIDES:${PN} += "libpapi \
libpapi.so.7.0 \
libsde.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm.so.4"

inherit rpm
