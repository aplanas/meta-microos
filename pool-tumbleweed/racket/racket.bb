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

PV = "8.10"

RPM_NAME = "racket-8.10-1.1.aarch64.rpm"
RPM_HASH = "a1e19ea69c36aa9289c268d2fe175d35e7f690763ab50e8f4a2c0a1e8f5d51455724efd49702d98989c17c75b63b3055c0b5e170b20e94ac493ae5dfb846eede"

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
