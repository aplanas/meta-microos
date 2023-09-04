SUMMARY = "Access RStudio via a web browser running on a remote server"
DESCRIPTION = "RStudio Server enables you to provide a browser-based interface (the RStudio \
IDE) to a version of R running on a remote Linux server. Deploying R and RStudio \
on a server has a number of benefits, including: \
 \
- The ability to access your R workspace from any computer in any location \
- Easy sharing of code, data, and other files with colleagues \
- Allowing multiple users to share access to the more powerful compute resources \
  (memory, processors, etc.) available on a well-equipped server \
- Centralized installation and configuration of R, R packages, TeX, and other \
  supporting libraries"
LICENSE = "AGPL-3.0-only & Apache-2.0 & MPL-1.1 & LGPL-2.1-or-later & GPL-2.0-only & MIT & W3C-20150513 & BSD-3-Clause & (BSL-1.0 | MIT) & GPL-3.0-only & ISC & OFL-1.1 & Zlib & NPL-1.1 & CC-BY-4.0 & EPL-1.0"

PV = "2023.06.0+421"

RPM_NAME = "rstudio-server-2023.06.0+421-1.4.aarch64.rpm"
RPM_HASH = "7bdc8330fc0e30eb2119def63b852a30af13b51b7592cd116098f3becb4dccb00fdbe7e6161f2eac98e3f6547de3e49ac0ee9f0d63be61f1dcd2b591a2039b98"

RPROVIDES:${PN} += "config-rstudio-server \
group-rstudio-server \
rstudio-server \
user-rstudio-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libpam.so.0 \
libsoci-core.so.4.0 \
libsoci-postgresql.so.4.0 \
libsoci-sqlite3.so.4.0 \
libssl.so.3 \
libstdc++.so.6 \
libuuid.so.1 \
rstudio \
sysuser-shadow"

inherit rpm
