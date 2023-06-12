SUMMARY = "Samba Ldb Ldap Modules"
DESCRIPTION = "samba-ldb-ldap contains the ldb ldap module required by samba-tool and \
samba-gpupdate."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-ldb-ldap-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "78c6056717d7e5eb529a0b6e4c4ae61ca6b817692666018ceb70282a57eb530ffddb5e58d009d966184cdc0cb508805fd3ba294f0999e8e7586fd082e9d2090f"

RPROVIDES:${PN} += "samba-ldb-ldap \
samba-ldb-ldap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcli-ldap-common-samba4.so()(64bit) \
libcli-ldap-common-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcli-ldap-samba4.so()(64bit) \
libcli-ldap-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcmdline-samba4.so()(64bit) \
libcmdline-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libgensec-samba4.so()(64bit) \
libgensec-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libldb.so.2()(64bit) \
libldb.so.2(LDB_0.9.10)(64bit) \
libldb.so.2(LDB_0.9.15)(64bit) \
libldb.so.2(LDB_0.9.18)(64bit) \
libldb.so.2(LDB_0.9.19)(64bit) \
libldbsamba-samba4.so()(64bit) \
libldbsamba-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
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
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libtevent.so.0()(64bit) \
libtevent.so.0(TEVENT_0.9.9)(64bit)"

inherit rpm
