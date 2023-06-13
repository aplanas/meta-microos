SUMMARY = "A SMB/CIFS File, Print, and Authentication Server"
DESCRIPTION = "Samba is a suite of programs that allows SMB/CIFS clients to use the \
Unix file space, printers, and authentication subsystem. \
 \
The package named samba contains all programs that are needed to act as \
a server.  The binaries expect the configuration file to be found in \
/etc/samba/smb.conf \
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

RPM_NAME = "samba-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "0832603e6d0987e010401b0cd5dab0696ed30e3ea6535d5a437dfa281e58bd07f730c592d0db9e0fa26f3e2f389ab03b0356e151020544228702bd1ff02a74ca"

RPROVIDES:${PN} += "config(samba) \
group(ntadmin) \
samba \
samba(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/grep \
/usr/bin/mkdir \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libCHARSET3-samba4.so()(64bit) \
libMESSAGING-samba4.so()(64bit) \
libREG-FULL-samba4.so()(64bit) \
libRPC-SERVER-LOOP-samba4.so()(64bit) \
libRPC-WORKER-samba4.so()(64bit) \
libads-samba4.so()(64bit) \
libauth-samba4.so()(64bit) \
libauth4-samba4.so()(64bit) \
libc.so.6()(64bit) \
libcli-cldap-samba4.so()(64bit) \
libcli-nbt-samba4.so()(64bit) \
libcli-smb-common-samba4.so()(64bit) \
libcli-spoolss-samba4.so()(64bit) \
libcliauth-samba4.so()(64bit) \
libcmdline-contexts-samba4.so()(64bit) \
libcmdline-samba4.so()(64bit) \
libcommon-auth-samba4.so()(64bit) \
libcups.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbwrap-samba4.so()(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdcerpc-samba-samba4.so()(64bit) \
libdcerpc-server-core.so.0()(64bit) \
libevents-samba4.so()(64bit) \
libgenrand-samba4.so()(64bit) \
libgensec-samba4.so()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_13)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit) \
libgse-samba4.so()(64bit) \
libiov-buf-samba4.so()(64bit) \
libldap.so.2()(64bit) \
liblibcli-lsa3-samba4.so()(64bit) \
liblibcli-netlogon3-samba4.so()(64bit) \
liblibsmb-samba4.so()(64bit) \
libmessages-dgm-samba4.so()(64bit) \
libmsghdr-samba4.so()(64bit) \
libmsrpc3-samba4.so()(64bit) \
libndr-nbt.so.0()(64bit) \
libndr-samba-samba4.so()(64bit) \
libndr-samba4.so()(64bit) \
libndr-standard.so.0()(64bit) \
libndr.so.3()(64bit) \
libnetapi.so.1()(64bit) \
libnpa-tstream-samba4.so()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libposix-eadb-samba4.so()(64bit) \
libprinting-migrate-samba4.so()(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-cluster-support-samba4.so()(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-passdb.so.0()(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-sockets-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsamba3-util-samba4.so()(64bit) \
libsamdb.so.0()(64bit) \
libsecrets3-samba4.so()(64bit) \
libsmbconf.so.0()(64bit) \
libsmbd-base-samba4.so()(64bit) \
libsmbd-shim-samba4.so()(64bit) \
libsocket-blocking-samba4.so()(64bit) \
libsys-rw-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtdb-wrap-samba4.so()(64bit) \
libtdb.so.1()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
libtime-basic-samba4.so()(64bit) \
liburing.so.2()(64bit) \
libutil-reg-samba4.so()(64bit) \
libutil-tdb-samba4.so()(64bit) \
libwbclient.so.0()(64bit) \
libxattr-tdb-samba4.so()(64bit) \
samba-client \
system-user-nobody \
sysuser-shadow"

inherit rpm
