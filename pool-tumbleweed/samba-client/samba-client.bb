SUMMARY = "Samba Client Utilities"
DESCRIPTION = "Samba is a suite of programs that allows SMB/CIFS clients to use the \
Unix file space, printers, and authentication subsystem. \
 \
The package named samba-client contains all programs that are needed to \
act as a Samba client. The binaries expect the configuration file to \
be found in /etc/samba/smb.conf \
 \
For a more detailed description of Samba, check the samba-doc package \
or the Samba.org Web page at https://www.Samba.org/ \
 \
Please check https://en.openSUSE.org/Samba for general information on \
Samba as part of SUSE Linux Enterprise or openSUSE products, links to \
binary packages of the most current Samba version, and a bug reporting \
how to."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-client-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "1c7de8fb0663659ffd44240d0850317d91e914d27224b214133a6afc6994de90471456b255c7ba3d39792306786ca43e39778c8c4a6821578078599367d738e6"

RPROVIDES:${PN} += "config(samba-client) \
libnss_wins.so.2()(64bit) \
libnss_wins.so.2(NSS_WINS_2)(64bit) \
samba-client \
samba-client(aarch-64) \
smbfs"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
libCHARSET3-samba4.so()(64bit) \
libaddns-samba4.so()(64bit) \
libads-samba4.so()(64bit) \
libarchive.so.13()(64bit) \
libauth-samba4.so()(64bit) \
libc.so.6()(64bit) \
libcli-cldap-samba4.so()(64bit) \
libcli-ldap-samba4.so()(64bit) \
libcli-smb-common-samba4.so()(64bit) \
libcli-spoolss-samba4.so()(64bit) \
libcliauth-samba4.so()(64bit) \
libcmdline-contexts-samba4.so()(64bit) \
libcmdline-samba4.so()(64bit) \
libcom_err.so.2()(64bit) \
libcommon-auth-samba4.so()(64bit) \
libdbwrap-samba4.so()(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdcerpc-samba-samba4.so()(64bit) \
libevents-samba4.so()(64bit) \
libflag-mapping-samba4.so()(64bit) \
libform.so.6()(64bit) \
libgenrand-samba4.so()(64bit) \
libgensec-samba4.so()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_13)(64bit) \
libgpo-samba4.so()(64bit) \
libgse-samba4.so()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5samba-samba4.so()(64bit) \
libldap.so.2()(64bit) \
libldb.so.2()(64bit) \
libldbsamba-samba4.so()(64bit) \
liblibcli-lsa3-samba4.so()(64bit) \
liblibcli-netlogon3-samba4.so()(64bit) \
liblibsmb-samba4.so()(64bit) \
libmscat-samba4.so()(64bit) \
libmsrpc3-samba4.so()(64bit) \
libncurses.so.6()(64bit) \
libndr-krb5pac.so.0()(64bit) \
libndr-nbt.so.0()(64bit) \
libndr-samba-samba4.so()(64bit) \
libndr-samba4.so()(64bit) \
libndr-standard.so.0()(64bit) \
libndr.so.3()(64bit) \
libnet-keytab-samba4.so()(64bit) \
libnetapi.so.1()(64bit) \
libpanel.so.6()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libprinting-migrate-samba4.so()(64bit) \
libreadline.so.8()(64bit) \
libregistry-samba4.so()(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-passdb.so.0()(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-sockets-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsamba3-util-samba4.so()(64bit) \
libsamdb-common-samba4.so()(64bit) \
libsamdb.so.0()(64bit) \
libsecrets3-samba4.so()(64bit) \
libserver-id-db-samba4.so()(64bit) \
libserver-role-samba4.so()(64bit) \
libsmbclient-raw-samba4.so()(64bit) \
libsmbclient.so.0()(64bit) \
libsmbconf.so.0()(64bit) \
libsmbd-base-samba4.so()(64bit) \
libsmbd-shim-samba4.so()(64bit) \
libsmbldap.so.2()(64bit) \
libsmbldap.so.2(SMBLDAP_0)(64bit) \
libsocket-blocking-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtdb.so.1()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
libtime-basic-samba4.so()(64bit) \
libtinfo.so.6()(64bit) \
libtrusts-util-samba4.so()(64bit) \
libutil-reg-samba4.so()(64bit) \
libutil-tdb-samba4.so()(64bit) \
libwbclient.so.0()(64bit)"

inherit rpm
