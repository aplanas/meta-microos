SUMMARY = "RStudio base package"
DESCRIPTION = "This package provides the common files of RStudio Desktop and RStudio server."
LICENSE = "AGPL-3.0-only & Apache-2.0 & MPL-1.1 & LGPL-2.1-or-later & GPL-2.0-only & MIT & W3C-20150513 & BSD-3-Clause & (BSL-1.0 | MIT) & GPL-3.0-only & ISC & OFL-1.1 & Zlib & NPL-1.1 & CC-BY-4.0 & EPL-1.0"

PV = "2023.06.0+421"

RPM_NAME = "rstudio-2023.06.0+421-1.4.aarch64.rpm"
RPM_HASH = "a2a01f6bb1156c6f799ba98d7462f06c8e9e7d1d07a64c1e810c998f134d8684a8085cead020bd9a2a173dabb826c98c454c76b3ab02d31fe02e02422680adf3"

RPROVIDES:${PN} += "bundled-ace.js \
bundled-aopalliance \
bundled-datatables \
bundled-elemental2 \
bundled-fast-text-encoding \
bundled-focus-visible.js \
bundled-fontawesome \
bundled-gin \
bundled-gsl-lite \
bundled-guice \
bundled-gwt-rstudio \
bundled-gwt-websockets \
bundled-highlight.js \
bundled-inert-polyfill.js \
bundled-jquery.js \
bundled-jsbn \
bundled-pdf.js \
bundled-qtsingleapplication \
bundled-quinit.js \
bundled-rapidxml \
bundled-reveal.js \
bundled-sundown \
bundled-tree.hh \
rstudio"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
R-base \
R-core-libs \
ld-linux-aarch64.so.1 \
libR.so \
libboost-chrono.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libfmt.so.9 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libsoci-core.so.4.0 \
libsoci-postgresql.so.4.0 \
libsoci-sqlite3.so.4.0 \
libssl.so.3 \
libstdc++.so.6 \
libuuid.so.1 \
libyaml-cpp.so.0.8 \
libz.so.1 \
systemd"

inherit rpm
