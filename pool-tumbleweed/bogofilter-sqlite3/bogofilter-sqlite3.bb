SUMMARY = "Bogofilter sqlite3 backend"
DESCRIPTION = "This package contains bogofilter build with the sqlite3 backend."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "bogofilter-sqlite3-1.2.4-15.12.aarch64.rpm"
RPM_HASH = "5eeaf219e99c8742aab58d8c525386b4f1c2a3d20335de7b0db85da53c23eed1a49183ecd4b0680931fbc238bfc9bb3b6712b3df1c5076224412d4fb563da888"

RPROVIDES:${PN} += "bogofilter-backend \
bogofilter-sqlite3 \
bogofilter-sqlite3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
bogofilter-common \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
update-alternatives"

inherit rpm
