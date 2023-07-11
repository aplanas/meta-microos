SUMMARY = "Groupware server backend with RPC, IMAP,POP3, PHP-MAPI support"
DESCRIPTION = "Gromox is the central groupware server component of grommunio. It is \
capable of serving as a replacement for Microsoft Exchange and \
compatibles. Connectivity options include RPC/HTTP (Outlook \
Anywhere), MAPI/HTTP, IMAP, POP3, an SMTP-speaking LDA, and a PHP \
module with a Z-MAPI function subset. \
 \
Gromox relies on other components to provide a sensibly complete mail \
system, such as Postfix as a mail transfer agent, and grommunio-admin \
for user management. A webmail client interface is available with \
grommunio-web. The grommunio appliance ships these essentials and has a \
ready-to-run installation of Gromox."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only & GPL-3.0-or-later"

PV = "2.10"

RPM_NAME = "gromox-2.10-1.2.aarch64.rpm"
RPM_HASH = "f84449cf112ce58a7a6c12a6d6cd045c717d92d4da7732557b56898e8572cd18e9b8093f7fb60e923ddfe74bb2565ac17218c8dfe8a61278eabdf699a65895d7"

RPROVIDES:${PN} += "bundled-tzcode \
gromox \
libgromox-common.so.0 \
libgromox-cplus.so.0 \
libgromox-dbop.so.0 \
libgromox-email.so.0 \
libgromox-epoll.so.0 \
libgromox-exrpc.so.0 \
libgromox-mapi.so.0 \
libgromox-rpc.so.0 \
libgxh-ews.so \
libgxh-mh-emsmdb.so \
libgxh-mh-nsp.so \
libgxh-oab.so \
libgxh-oxdisco.so \
libgxm-alias-resolve.so \
libgxm-exmdb-local.so \
libgxm-mlist-expand.so \
libgxm-remote-delivery.so \
libgxp-exchange-emsmdb.so \
libgxp-exchange-nsp.so \
libgxp-exchange-rfr.so \
libgxs-authmgr.so \
libgxs-dnsbl-filter.so \
libgxs-event-proxy.so \
libgxs-event-stub.so \
libgxs-exmdb-provider.so \
libgxs-ldap-adaptor.so \
libgxs-midb-agent.so \
libgxs-mysql-adaptor.so \
libgxs-timer-agent.so \
libgxs-user-filter.so \
php-mapi-gromox"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
glibc-locale-base \
group-gromox \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libcurl.so.4 \
libfmt.so.9 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libldap.so.2 \
libm.so.6 \
libmariadb.so.3 \
libolecf.so.1 \
libpam.so.0 \
libpff.so.1 \
libresolv.so.2 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtinyxml2.so.9 \
libvmime-suse.so.5 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1 \
php8-cli \
php8-fpm \
php8-mysql \
php8-posix \
php8-soap \
user-grommunio \
user-gromox \
w3m"

inherit rpm
