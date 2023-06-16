SUMMARY = "Scheme implementation with teaching tools"
DESCRIPTION = "Racket (formerly called PLT Scheme) is a multi-paradigm programming language \
in the Lisp/Scheme family, that also serves as a platform for language \
creation, design, and implementation. \
 \
The programming language is known for its powerful macro system which enables \
the creation of embedded and domain-specific languages, language constructs \
such as classes or modules, and separate dialects of Racket enable different \
semantics."
LICENSE = "Apache-2.0 | MIT"

PV = "8.9"

RPM_NAME = "racket-8.9-1.1.aarch64.rpm"
RPM_HASH = "1d04577b12106ab124ff5a98a6d9e07ccfe3c8c0cc8292541583bba623bcf715598a6ef8db3c1481c1e37631c1212db6cb2bd116abab6cc9339ce9048e45ecbb"

RPROVIDES:${PN} += "config-racket \
racket \
racket-drracket \
racket-games \
racket-webserver"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo2 \
libedit0 \
libglib-2-0-0 \
libgtk-3-0 \
liblz4.so.1 \
libm.so.6 \
libpango-1-0-0 \
libsqlite3-0 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
