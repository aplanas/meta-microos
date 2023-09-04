SUMMARY = "Parses Date::Parse compatible formats"
DESCRIPTION = "This module is a compatibility wrapper around Date::Parse. \
 \
  Author:	Joshua Hoblitt (JHOBLITT) <jhoblitt@cpan.org>"
LICENSE = "GPL-2.0 | Artistic-1.0"

PV = "0.05"

RPM_NAME = "perl-DateTime-Format-DateParse-0.05-22.26.noarch.rpm"
RPM_HASH = "cd9e4a498227fbad6c96994113422137ec560d96478938fe0b4b6921b31066c0ad7e080a21fb94653142a984c8e5d6ed451d9b452d548c3bdb4ce0c7800f00ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--DateParse \
perl-DateTime-Format-DateParse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Date--Parse \
perl-DateTime \
perl-DateTime--Locale \
perl-DateTime--TimeZone \
perl-Time--Zone"

inherit rpm
