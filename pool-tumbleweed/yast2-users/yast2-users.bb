SUMMARY = "YaST2 - User and Group Configuration"
DESCRIPTION = "This package provides GUI for maintenance of linux users and groups."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-users-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "3dd971d1a137cfbefeb82c122912dec9a0f02058c488b938f352ecdfd0d3cfdc83214c4914f9caae14ab0005c605b17101e5692433d74567f02d468639ea6f03"

RPROVIDES:${PN} += "libpy2ag-crack.so.2 \
perl-Users \
perl-UsersCache \
perl-UsersLDAP \
perl-UsersPasswd \
perl-UsersPluginKerberos \
perl-UsersPluginLDAPAll \
perl-UsersPluginLDAPPasswordPolicy \
perl-UsersPluginLDAPShadowAccount \
perl-UsersPluginQuota \
perl-UsersPlugins \
perl-UsersRoutines \
perl-UsersSimple \
perl-YaPI--ADMINISTRATOR \
perl-YaPI--USERS \
yast2-users"

RDEPENDS:${PN} += "/usr/bin/perl \
cracklib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
libgcc-s.so.1 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
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
