SUMMARY = "YaST2 - Mail Configuration"
DESCRIPTION = "The YaST2 component for mail configuration. It handles Postfix, Cyrus, \
Amavis and Fetchmail."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-mail-4.6.0-1.1.noarch.rpm"
RPM_HASH = "da9324874f2edfe161f3cbb9e2a42c5d582ac5a24f38ebf49874698ae521cb8ab627b1e17aeb9512d1ab5294f57e7dd1ace6c39a9bade27d4ad424f80e57b4be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Mail.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Mail.metainfo.xml) \
perl(MasterCFParser) \
yast2-mail"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/touch \
fillup \
yast2 \
yast2-ldap \
yast2-ruby-bindings \
yast2-users"

inherit rpm
