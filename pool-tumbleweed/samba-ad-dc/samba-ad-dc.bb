SUMMARY = "Samba Active Directory-compatible Domain Controller"
DESCRIPTION = "This package contains the Active Directory-compatible Domain Controller"
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-ad-dc-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "cd762e61ef8c3cf663870218699de2a8d6ed9f5033d5aac10bcff892642d9441c460cfd16a8b1612d3b9d21a03a26e0b189e9aa8467d81fbd3ddbbe8139bb98d"

RPROVIDES:${PN} += "samba-ad-dc \
samba-ad-dc(aarch-64) \
samba-kdc"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libMESSAGING-SEND-samba4.so()(64bit) \
libMESSAGING-SEND-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libMESSAGING-samba4.so()(64bit) \
libMESSAGING-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcliauth-samba4.so()(64bit) \
libcliauth-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcluster-samba4.so()(64bit) \
libcluster-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcmdline-samba4.so()(64bit) \
libcmdline-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libevents-samba4.so()(64bit) \
libevents-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libgenrand-samba4.so()(64bit) \
libgenrand-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libgensec-samba4.so()(64bit) \
libgensec-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libldb.so.2()(64bit) \
libldb.so.2(LDB_0.9.10)(64bit) \
libndr-samba4.so()(64bit) \
libndr-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libprocess-model-samba4.so()(64bit) \
libprocess-model-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libreplace-samba4.so()(64bit) \
libreplace-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-credentials.so.1(SAMBA_CREDENTIALS_1.0.0)(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-debug-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-hostconfig.so.0(SAMBA_HOSTCONFIG_0.0.1)(64bit) \
libsamba-util.so.0()(64bit) \
libsamba-util.so.0(SAMBA_UTIL_0.0.1)(64bit) \
libsamdb-common-samba4.so()(64bit) \
libsamdb-common-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamdb.so.0()(64bit) \
libsamdb.so.0(SAMDB_0.0.1)(64bit) \
libservice-samba4.so()(64bit) \
libservice-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsocket-blocking-samba4.so()(64bit) \
libsocket-blocking-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libtevent.so.0()(64bit) \
libtevent.so.0(TEVENT_0.9.16)(64bit) \
libtevent.so.0(TEVENT_0.9.9)(64bit) \
samba \
samba-dsdb-modules \
samba-python3 \
samba-tool"

inherit rpm