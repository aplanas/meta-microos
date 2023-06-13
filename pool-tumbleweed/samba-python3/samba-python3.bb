SUMMARY = "Samba Python3 libraries"
DESCRIPTION = "The samba-python3 package contains the Python libraries needed by programs \
that use SMB, RPC and other Samba provided protocols in Python3 programs."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-python3-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "1c6f8b9506f4248830cae48a5c9c58c39956ae66fce0570542052a16a77149d71ffb7c1d0516578afae041db4feb24b85c8eea1f675dec3a877bbef08e5b1332"

RPROVIDES:${PN} += "samba-python3 \
samba-python3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libMESSAGING-SEND-samba4.so()(64bit) \
libMESSAGING-samba4.so()(64bit) \
libaddns-samba4.so()(64bit) \
libads-samba4.so()(64bit) \
libauth-unix-token-samba4.so()(64bit) \
libauth4-samba4.so()(64bit) \
libauthkrb5-samba4.so()(64bit) \
libc.so.6()(64bit) \
libcli-ldap-samba4.so()(64bit) \
libcli-nbt-samba4.so()(64bit) \
libcli-smb-common-samba4.so()(64bit) \
libcliauth-samba4.so()(64bit) \
libcluster-samba4.so()(64bit) \
libcmdline-contexts-samba4.so()(64bit) \
libcom_err.so.2()(64bit) \
libcommon-auth-samba4.so()(64bit) \
libdb-glue-samba4.so()(64bit) \
libdbwrap-samba4.so()(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdcerpc-samba-samba4.so()(64bit) \
libdcerpc-samba4.so()(64bit) \
libdcerpc.so.0()(64bit) \
libdnsserver-common-samba4.so()(64bit) \
libdsdb-garbage-collect-tombstones-samba4.so()(64bit) \
libevents-samba4.so()(64bit) \
libflag-mapping-samba4.so()(64bit) \
libgenrand-samba4.so()(64bit) \
libgensec-samba4.so()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_13)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit) \
libgpo-samba4.so()(64bit) \
libgse-samba4.so()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5samba-samba4.so()(64bit) \
libldb.so.2()(64bit) \
libldbsamba-samba4.so()(64bit) \
liblibcli-lsa3-samba4.so()(64bit) \
liblibcli-netlogon3-samba4.so()(64bit) \
liblibsmb-samba4.so()(64bit) \
libmsrpc3-samba4.so()(64bit) \
libndr-krb5pac.so.0()(64bit) \
libndr-nbt.so.0()(64bit) \
libndr-samba-samba4.so()(64bit) \
libndr-samba4.so()(64bit) \
libndr-standard.so.0()(64bit) \
libndr.so.3()(64bit) \
libnetif-samba4.so()(64bit) \
libposix-eadb-samba4.so()(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2()(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2()(64bit) \
libpython3.10.so.1.0()(64bit) \
libregistry-samba4.so()(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-net.cpython-310-aarch64-linux-gnu-samba4.so()(64bit) \
libsamba-passdb.so.0()(64bit) \
libsamba-policy.cpython-310-aarch64-linux-gnu.so.0()(64bit) \
libsamba-policy0-python3 \
libsamba-python.cpython-310-aarch64-linux-gnu-samba4.so()(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsamba3-util-samba4.so()(64bit) \
libsamdb-common-samba4.so()(64bit) \
libsamdb.so.0()(64bit) \
libscavenge-dns-records-samba4.so()(64bit) \
libsecrets3-samba4.so()(64bit) \
libserver-role-samba4.so()(64bit) \
libsmbconf.so.0()(64bit) \
libsmbd-base-samba4.so()(64bit) \
libstable-sort-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtdb-wrap-samba4.so()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
libtrusts-util-samba4.so()(64bit) \
libutil-reg-samba4.so()(64bit) \
libxattr-tdb-samba4.so()(64bit) \
python(abi) \
python3-ldb \
python3-talloc \
python3-tdb \
python3-tevent \
samba"

inherit rpm
