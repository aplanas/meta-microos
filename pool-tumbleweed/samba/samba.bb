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

RPROVIDES:${PN} += "config-samba \
group-ntadmin \
samba"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/grep \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libCHARSET3-samba4.so \
libMESSAGING-samba4.so \
libREG-FULL-samba4.so \
libRPC-SERVER-LOOP-samba4.so \
libRPC-WORKER-samba4.so \
libads-samba4.so \
libauth-samba4.so \
libauth4-samba4.so \
libc.so.6 \
libcli-cldap-samba4.so \
libcli-nbt-samba4.so \
libcli-smb-common-samba4.so \
libcli-spoolss-samba4.so \
libcliauth-samba4.so \
libcmdline-contexts-samba4.so \
libcmdline-samba4.so \
libcommon-auth-samba4.so \
libcups.so.2 \
libdbus-1.so.3 \
libdbwrap-samba4.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-samba4.so \
libdcerpc-server-core.so.0 \
libevents-samba4.so \
libgenrand-samba4.so \
libgensec-samba4.so \
libgnutls.so.30 \
libgse-samba4.so \
libiov-buf-samba4.so \
libldap.so.2 \
liblibcli-lsa3-samba4.so \
liblibcli-netlogon3-samba4.so \
liblibsmb-samba4.so \
libmessages-dgm-samba4.so \
libmsghdr-samba4.so \
libmsrpc3-samba4.so \
libndr-nbt.so.0 \
libndr-samba-samba4.so \
libndr-samba4.so \
libndr-standard.so.0 \
libndr.so.3 \
libnetapi.so.1 \
libnpa-tstream-samba4.so \
libpopt.so.0 \
libposix-eadb-samba4.so \
libprinting-migrate-samba4.so \
libreplace-samba4.so \
libsamba-cluster-support-samba4.so \
libsamba-credentials.so.1 \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-passdb.so.0 \
libsamba-security-samba4.so \
libsamba-sockets-samba4.so \
libsamba-util.so.0 \
libsamba3-util-samba4.so \
libsamdb.so.0 \
libsecrets3-samba4.so \
libsmbconf.so.0 \
libsmbd-base-samba4.so \
libsmbd-shim-samba4.so \
libsocket-blocking-samba4.so \
libsys-rw-samba4.so \
libtalloc.so.2 \
libtdb-wrap-samba4.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-samba4.so \
liburing.so.2 \
libutil-reg-samba4.so \
libutil-tdb-samba4.so \
libwbclient.so.0 \
libxattr-tdb-samba4.so \
samba-client \
system-user-nobody \
sysuser-shadow"

inherit rpm
