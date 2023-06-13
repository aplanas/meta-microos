SUMMARY = "Headers and development package for libmrss"
DESCRIPTION = "libmRSS is a C library for parsing, writing, and creating RSS (Rich Site \
Summary, Really Simple Syndication, and RDF Site Summary) and ATOM files or \
streams. The formats supported are: RSS 0.91, RSS 0.92, RSS 1.0, RSS 2.0, ATOM \
0.3, and ATOM 1.0."
LICENSE = "LGPL-2.1-only"

PV = "0.19.3"

RPM_NAME = "libmrss-devel-0.19.3-1.2.aarch64.rpm"
RPM_HASH = "2a09f8ce75070d1da7917450ec56b939b0a435160c01a65adaabec88ea9e929e15f29a4831cadb5683243ec4518309e4552468971958215a1c984b0d21cf34a3"

RPROVIDES:${PN} += "libmrss-devel \
libmrss-devel(aarch-64) \
pkgconfig(mrss)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
curl-devel \
libmrss0 \
libnxml-devel \
pkgconfig(nxml)"

inherit rpm
