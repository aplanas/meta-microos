SUMMARY = "Samba Python3 libraries"
DESCRIPTION = "The samba-python3 package contains the Python libraries needed by programs \
that use SMB, RPC and other Samba provided protocols in Python3 programs."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-python3-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "1c6f8b9506f4248830cae48a5c9c58c39956ae66fce0570542052a16a77149d71ffb7c1d0516578afae041db4feb24b85c8eea1f675dec3a877bbef08e5b1332"

RPROVIDES:${PN} += "samba-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMESSAGING-SEND-samba4.so \
libMESSAGING-samba4.so \
libaddns-samba4.so \
libads-samba4.so \
libauth-unix-token-samba4.so \
libauth4-samba4.so \
libauthkrb5-samba4.so \
libc.so.6 \
libcli-ldap-samba4.so \
libcli-nbt-samba4.so \
libcli-smb-common-samba4.so \
libcliauth-samba4.so \
libcluster-samba4.so \
libcmdline-contexts-samba4.so \
libcom-err.so.2 \
libcommon-auth-samba4.so \
libdb-glue-samba4.so \
libdbwrap-samba4.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-samba4.so \
libdcerpc-samba4.so \
libdcerpc.so.0 \
libdnsserver-common-samba4.so \
libdsdb-garbage-collect-tombstones-samba4.so \
libevents-samba4.so \
libflag-mapping-samba4.so \
libgenrand-samba4.so \
libgensec-samba4.so \
libgnutls.so.30 \
libgpo-samba4.so \
libgse-samba4.so \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libkrb5samba-samba4.so \
libldb.so.2 \
libldbsamba-samba4.so \
liblibcli-lsa3-samba4.so \
liblibcli-netlogon3-samba4.so \
liblibsmb-samba4.so \
libmsrpc3-samba4.so \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr-samba-samba4.so \
libndr-samba4.so \
libndr-standard.so.0 \
libndr.so.3 \
libnetif-samba4.so \
libposix-eadb-samba4.so \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2 \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2 \
libpython3.10.so.1.0 \
libregistry-samba4.so \
libreplace-samba4.so \
libsamba-credentials.so.1 \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-net.cpython-310-aarch64-linux-gnu-samba4.so \
libsamba-passdb.so.0 \
libsamba-policy.cpython-310-aarch64-linux-gnu.so.0 \
libsamba-policy0-python3 \
libsamba-python.cpython-310-aarch64-linux-gnu-samba4.so \
libsamba-security-samba4.so \
libsamba-util.so.0 \
libsamba3-util-samba4.so \
libsamdb-common-samba4.so \
libsamdb.so.0 \
libscavenge-dns-records-samba4.so \
libsecrets3-samba4.so \
libserver-role-samba4.so \
libsmbconf.so.0 \
libsmbd-base-samba4.so \
libstable-sort-samba4.so \
libtalloc.so.2 \
libtdb-wrap-samba4.so \
libtevent-util.so.0 \
libtevent.so.0 \
libtrusts-util-samba4.so \
libutil-reg-samba4.so \
libxattr-tdb-samba4.so \
python-abi \
python3-ldb \
python3-talloc \
python3-tdb \
python3-tevent \
samba"

inherit rpm
