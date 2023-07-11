SUMMARY = "Class for easy date and time manipulation"
DESCRIPTION = "This module is intended to provide a general-purpose date and datetime type \
for perl. You have a Class::Date class for absolute date and datetime, and \
have a Class::Date::Rel class for relative dates. \
 \
You can use '+', '-', '<' and '>' operators as with native perl data types."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1.17"

RPM_NAME = "perl-Class-Date-1.1.17-1.20.aarch64.rpm"
RPM_HASH = "c171e78a9094d4e9d4a4388ef8467edb2ca14d62d02955886c0b2f04673edcfff64b3ab0f1dd71d22e5fd2b01c226836889786b87362dd44c1b0eb39d1357393"

RPROVIDES:${PN} += "perl-Class--Date \
perl-Class--Date--Const \
perl-Class--Date--Invalid \
perl-Class--Date--Rel \
perl-Class-Date"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
