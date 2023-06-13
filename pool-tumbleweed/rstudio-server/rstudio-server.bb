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

PV = "2023.03.0+386"

RPM_NAME = "rstudio-server-2023.03.0+386-1.2.aarch64.rpm"
RPM_HASH = "ce66076588c479070ee7d8aab7a3070f2b6e03696902522d2d2be561be64cc865aa8b46013e5409dc8b17b34cf8c7cb313449169d2cd97f29d143f137d0ac7aa"

RPROVIDES:${PN} += "config(rstudio-server) \
group(rstudio-server) \
rstudio-server \
rstudio-server(aarch-64) \
user(rstudio-server)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
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
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
rstudio \
sysuser-shadow"

inherit rpm
