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

PV = "2.9"

RPM_NAME = "gromox-2.9-1.1.aarch64.rpm"
RPM_HASH = "04af1266f559021f24b341c7ee30998e06efd874ff3f929f074f5a5143090361791f317b64f4d0627726a3d6ab41c4439d129d76123f219fed9d409763f244bc"

RPROVIDES:${PN} += "bundled(tzcode) \
gromox \
gromox(aarch-64) \
libgromox_common.so.0()(64bit) \
libgromox_cplus.so.0()(64bit) \
libgromox_dbop.so.0()(64bit) \
libgromox_email.so.0()(64bit) \
libgromox_epoll.so.0()(64bit) \
libgromox_exrpc.so.0()(64bit) \
libgromox_mapi.so.0()(64bit) \
libgromox_rpc.so.0()(64bit) \
libgxh_ews.so()(64bit) \
libgxh_mh_emsmdb.so()(64bit) \
libgxh_mh_nsp.so()(64bit) \
libgxh_oab.so()(64bit) \
libgxh_oxdisco.so()(64bit) \
libgxm_alias_resolve.so()(64bit) \
libgxm_exmdb_local.so()(64bit) \
libgxm_mlist_expand.so()(64bit) \
libgxm_remote_delivery.so()(64bit) \
libgxp_exchange_emsmdb.so()(64bit) \
libgxp_exchange_nsp.so()(64bit) \
libgxp_exchange_rfr.so()(64bit) \
libgxs_authmgr.so()(64bit) \
libgxs_event_proxy.so()(64bit) \
libgxs_event_stub.so()(64bit) \
libgxs_exmdb_provider.so()(64bit) \
libgxs_ip6_container.so()(64bit) \
libgxs_ip6_filter.so()(64bit) \
libgxs_ldap_adaptor.so()(64bit) \
libgxs_midb_agent.so()(64bit) \
libgxs_mysql_adaptor.so()(64bit) \
libgxs_timer_agent.so()(64bit) \
libgxs_user_filter.so()(64bit) \
php-mapi-gromox"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
glibc-locale-base \
group(gromox) \
ld-linux-aarch64.so.1()(64bit) \
libHX.so.32()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libjsoncpp.so.25()(64bit) \
libldap.so.2()(64bit) \
libm.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libolecf.so.1()(64bit) \
libolecf.so.1(V_20221024)(64bit) \
libpam.so.0()(64bit) \
libpff.so.1()(64bit) \
libpff.so.1(V_20230325)(64bit) \
libresolv.so.2()(64bit) \
libsqlite3.so.0()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libtinyxml2.so.9()(64bit) \
libvmime-suse.so.5()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
php8-cli \
php8-fpm \
php8-mysql \
php8-posix \
php8-soap \
user(grommunio) \
user(gromox) \
w3m"

inherit rpm
