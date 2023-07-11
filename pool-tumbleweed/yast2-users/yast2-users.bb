SUMMARY = "YaST2 - User and Group Configuration"
DESCRIPTION = "This package provides GUI for maintenance of linux users and groups."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-users-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "73711d40404c262cea81e96c4556aadba4cd9c0da527f81e7493363fb81bfda5b08fe22101777218098aaae16f6008078460f200897e2b4977d6f875b90b54b7"

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
