SUMMARY = "YaST2 - User and Group Configuration"
DESCRIPTION = "This package provides GUI for maintenance of linux users and groups."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-users-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "3dd971d1a137cfbefeb82c122912dec9a0f02058c488b938f352ecdfd0d3cfdc83214c4914f9caae14ab0005c605b17101e5692433d74567f02d468639ea6f03"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Users.desktop) \
libpy2ag_crack.so.2()(64bit) \
metainfo() \
metainfo(org.opensuse.yast.Users.metainfo.xml) \
perl(Users) \
perl(UsersCache) \
perl(UsersLDAP) \
perl(UsersPasswd) \
perl(UsersPluginKerberos) \
perl(UsersPluginLDAPAll) \
perl(UsersPluginLDAPPasswordPolicy) \
perl(UsersPluginLDAPShadowAccount) \
perl(UsersPluginQuota) \
perl(UsersPlugins) \
perl(UsersRoutines) \
perl(UsersSimple) \
perl(YaPI::ADMINISTRATOR) \
perl(YaPI::USERS) \
yast2-users \
yast2-users(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
cracklib \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrack.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libscr.so.3()(64bit) \
libstdc++.so.6()(64bit) \
liby2.so.4()(64bit) \
liby2util.so.5()(64bit) \
libycp.so.5()(64bit) \
libycpvalues.so.6()(64bit) \
perl-Digest-SHA1 \
perl-X500-DN \
perl-gettext \
yast2 \
yast2-core \
yast2-country \
yast2-ldap \
yast2-pam \
yast2-perl-bindings \
yast2-ruby-bindings \
yast2-security"

inherit rpm
