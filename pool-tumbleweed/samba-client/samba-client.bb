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

RPROVIDES:${PN} += "config-samba-client \
libnss-wins.so.2 \
samba-client \
smbfs"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
coreutils \
ld-linux-aarch64.so.1 \
libCHARSET3-samba4.so \
libaddns-samba4.so \
libads-samba4.so \
libarchive.so.13 \
libauth-samba4.so \
libc.so.6 \
libcli-cldap-samba4.so \
libcli-ldap-samba4.so \
libcli-smb-common-samba4.so \
libcli-spoolss-samba4.so \
libcliauth-samba4.so \
libcmdline-contexts-samba4.so \
libcmdline-samba4.so \
libcom-err.so.2 \
libcommon-auth-samba4.so \
libdbwrap-samba4.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-samba4.so \
libevents-samba4.so \
libflag-mapping-samba4.so \
libform.so.6 \
libgenrand-samba4.so \
libgensec-samba4.so \
libgnutls.so.30 \
libgpo-samba4.so \
libgse-samba4.so \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libkrb5samba-samba4.so \
libldap.so.2 \
libldb.so.2 \
libldbsamba-samba4.so \
liblibcli-lsa3-samba4.so \
liblibcli-netlogon3-samba4.so \
liblibsmb-samba4.so \
libmscat-samba4.so \
libmsrpc3-samba4.so \
libncurses.so.6 \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr-samba-samba4.so \
libndr-samba4.so \
libndr-standard.so.0 \
libndr.so.3 \
libnet-keytab-samba4.so \
libnetapi.so.1 \
libpanel.so.6 \
libpopt.so.0 \
libprinting-migrate-samba4.so \
libreadline.so.8 \
libregistry-samba4.so \
libreplace-samba4.so \
libsamba-credentials.so.1 \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-passdb.so.0 \
libsamba-security-samba4.so \
libsamba-sockets-samba4.so \
libsamba-util.so.0 \
libsamba3-util-samba4.so \
libsamdb-common-samba4.so \
libsamdb.so.0 \
libsecrets3-samba4.so \
libserver-id-db-samba4.so \
libserver-role-samba4.so \
libsmbclient-raw-samba4.so \
libsmbclient.so.0 \
libsmbconf.so.0 \
libsmbd-base-samba4.so \
libsmbd-shim-samba4.so \
libsmbldap.so.2 \
libsocket-blocking-samba4.so \
libtalloc.so.2 \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-samba4.so \
libtinfo.so.6 \
libtrusts-util-samba4.so \
libutil-reg-samba4.so \
libutil-tdb-samba4.so \
libwbclient.so.0"

inherit rpm
