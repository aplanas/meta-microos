SUMMARY = "Cxxtools Development Files"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. \
 \
It includes classes for: \
- argument parsing \
- logging \
- wrappers for threading (pthreads) \
- networking with tcp and udp including iostream-based classes \
- std::ostream for md5-calculation \
- std::ostream-hexdumper \
- std::ostream, which duplicates output (like tee) \
- wrappers for fork(2) and pipe(2) \
- parser for ini files \
- parser for property files \
- policy based smartpointer \
- wrappers for dlopen(2) and dlsym(2) \
- fast http client \
- uuencoder-std::ostream \
- classes to create mime messages for sending mail with attachements or \
  as html-formatted mail \
- template based fast signal/slot-classes \
- template for pools \
- parser for http-query-parameters e.g. for cgi \
- ostream-filter for counting bytes passed through it \
- wrappers for atomic operations"
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "cxxtools-devel-3.0-4.6.aarch64.rpm"
RPM_HASH = "3db62282e7b52962b7db487a6f220dc3acd4658a69fc8260b246bdb18a820b6a2c428b5f63375f00c6cedeff8fef4730113792cc9d6ffca5660b10d0910feba9"

RPROVIDES:${PN} += "cxxtools-devel \
libcxxtools-devel \
pkgconfig-cxxtools \
pkgconfig-cxxtools-bin \
pkgconfig-cxxtools-http \
pkgconfig-cxxtools-json \
pkgconfig-cxxtools-unit \
pkgconfig-cxxtools-xmlrpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools-bin.so.10 \
libcxxtools-bin10 \
libcxxtools-http10 \
libcxxtools-json10 \
libcxxtools-unit10 \
libcxxtools-xmlrpc10 \
libcxxtools.so.10 \
libcxxtools10 \
libgcc-s.so.1 \
libstdc++.so.6 \
pkgconfig-cxxtools \
pkgconfig-cxxtools-http"

inherit rpm
