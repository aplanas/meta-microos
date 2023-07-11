SUMMARY = "Parses Date::Parse compatible formats"
DESCRIPTION = "This module is a compatibility wrapper around Date::Parse. \
 \
  Author:	Joshua Hoblitt (JHOBLITT) <jhoblitt@cpan.org>"
LICENSE = "GPL-2.0 | Artistic-1.0"

PV = "0.05"

RPM_NAME = "perl-DateTime-Format-DateParse-0.05-22.25.noarch.rpm"
RPM_HASH = "3309ee9b31e19751fc6eca89167abecddc6dbe11ffaeace495f8ea6cfe212c400f7fa99c020327e67564655da42d2f091f35c69723ac4ecc6fc08458dac56088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--DateParse \
perl-DateTime-Format-DateParse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Date--Parse \
perl-DateTime \
perl-DateTime--Locale \
perl-DateTime--TimeZone \
perl-Time--Zone"

inherit rpm
