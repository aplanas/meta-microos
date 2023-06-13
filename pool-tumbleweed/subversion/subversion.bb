SUMMARY = "Subversion version control system"
DESCRIPTION = "Subversion exists to be universally recognized and adopted as an open-source, \
centralized version control system characterized by its reliability as a safe \
haven for valuable data; the simplicity of its model and usage; and its ability \
to support the needs of a wide variety of users and projects, from individuals \
to large-scale enterprise operations."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "7e58a87e412137e8ad81b925d7015b357250d951322d404fd0a2664cc8d9d904a66f8b09066a8ae0580c3fb1ad9be31c4d9b2a481c60fb7cae54de7b5420c876"

RPROVIDES:${PN} += "group(svn) \
libsvn_client-1.so.0()(64bit) \
libsvn_delta-1.so.0()(64bit) \
libsvn_diff-1.so.0()(64bit) \
libsvn_fs-1.so.0()(64bit) \
libsvn_fs_base-1.so.0()(64bit) \
libsvn_fs_fs-1.so.0()(64bit) \
libsvn_fs_util-1.so.0()(64bit) \
libsvn_fs_x-1.so.0()(64bit) \
libsvn_ra-1.so.0()(64bit) \
libsvn_ra_local-1.so.0()(64bit) \
libsvn_ra_serf-1.so.0()(64bit) \
libsvn_ra_svn-1.so.0()(64bit) \
libsvn_repos-1.so.0()(64bit) \
libsvn_subr-1.so.0()(64bit) \
libsvn_wc-1.so.0()(64bit) \
libsvnjavahl-1.so.0()(64bit) \
subversion \
subversion(aarch-64) \
subversion-javahl \
user(svn)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libapr-1.so.0()(64bit) \
libaprutil-1.so.0()(64bit) \
libc.so.6()(64bit) \
libdb-4.8.so()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
liblz4.so.1()(64bit) \
libmagic.so.1()(64bit) \
libsasl2.so.3()(64bit) \
libserf-1.so.1()(64bit) \
libsqlite3-0 \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libutf8proc.so.2()(64bit) \
libz.so.1()(64bit) \
systemd \
sysuser-shadow"

inherit rpm
