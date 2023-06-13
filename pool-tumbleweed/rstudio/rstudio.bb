SUMMARY = "RStudio base package"
DESCRIPTION = "This package provides the common files of RStudio Desktop and RStudio server."
LICENSE = "AGPL-3.0-only & Apache-2.0 & MPL-1.1 & LGPL-2.1-or-later & GPL-2.0-only & MIT & W3C-20150513 & BSD-3-Clause & (BSL-1.0 | MIT) & GPL-3.0-only & ISC & OFL-1.1 & Zlib & NPL-1.1 & CC-BY-4.0 & EPL-1.0"

PV = "2023.03.0+386"

RPM_NAME = "rstudio-2023.03.0+386-1.2.aarch64.rpm"
RPM_HASH = "da82155010e351dc3caa13a944635cfc4ce951306b7fd805000250c1908c804609bbc369bb99f76020c9917b573ee08d095c49a5ace7fd22da5c0559b6868fdd"

RPROVIDES:${PN} += "bundled(ace.js) \
bundled(aopalliance) \
bundled(datatables) \
bundled(elemental2) \
bundled(fast-text-encoding) \
bundled(focus-visible.js) \
bundled(fontawesome) \
bundled(gin) \
bundled(gsl-lite) \
bundled(guice) \
bundled(gwt-rstudio) \
bundled(gwt-websockets) \
bundled(highlight.js) \
bundled(inert-polyfill.js) \
bundled(jquery.js) \
bundled(jsbn) \
bundled(pdf.js) \
bundled(qtsingleapplication) \
bundled(quinit.js) \
bundled(rapidxml) \
bundled(reveal.js) \
bundled(sundown) \
bundled(tree.hh) \
rstudio \
rstudio(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/bash \
/usr/bin/env \
R-base \
R-core-libs \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libboost_chrono.so.1.82.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhunspell-1.7.so.0()(64bit) \
libsoci_core.so.4.0()(64bit) \
libsoci_postgresql.so.4.0()(64bit) \
libsoci_sqlite3.so.4.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libyaml-cpp.so.0.7()(64bit) \
libz.so.1()(64bit) \
systemd"

inherit rpm
