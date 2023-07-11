SUMMARY = "Subversion version control system"
DESCRIPTION = "Subversion exists to be universally recognized and adopted as an open-source, \
centralized version control system characterized by its reliability as a safe \
haven for valuable data; the simplicity of its model and usage; and its ability \
to support the needs of a wide variety of users and projects, from individuals \
to large-scale enterprise operations."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-1.14.2-6.1.aarch64.rpm"
RPM_HASH = "bcff5b59c67eab73aa73a61b47fa5a6adfc202a0b1d5327b33ccad3eff2c998a05e4b4fe4a6a3cc2d656f9af64bd867a9123ccac6c78f975aab964a80726efbc"

RPROVIDES:${PN} += "group-svn \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-fs-base-1.so.0 \
libsvn-fs-fs-1.so.0 \
libsvn-fs-util-1.so.0 \
libsvn-fs-x-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-ra-local-1.so.0 \
libsvn-ra-serf-1.so.0 \
libsvn-ra-svn-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
libsvnjavahl-1.so.0 \
subversion \
subversion-javahl \
user-svn"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libdb-4.8.so \
libexpat.so.1 \
libgcc-s.so.1 \
liblz4.so.1 \
libmagic.so.1 \
libsasl2.so.3 \
libserf-1.so.1 \
libsqlite3-0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libutf8proc.so.2 \
libz.so.1 \
systemd \
sysuser-shadow"

inherit rpm
