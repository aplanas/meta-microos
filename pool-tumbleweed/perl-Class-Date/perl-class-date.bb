SUMMARY = "Class for easy date and time manipulation"
DESCRIPTION = "This module is intended to provide a general-purpose date and datetime type \
for perl. You have a Class::Date class for absolute date and datetime, and \
have a Class::Date::Rel class for relative dates. \
 \
You can use '+', '-', '<' and '>' operators as with native perl data types."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1.17"

RPM_NAME = "perl-Class-Date-1.1.17-1.21.aarch64.rpm"
RPM_HASH = "cb2b417793d9ecf77f85f296fc39bb3eb0629392e43593003ad34340994c7fe767f1e44568203c9f16fa7d50246655d88733266645210e28d966345b230e12ba"

RPROVIDES:${PN} += "perl-Class--Date \
perl-Class--Date--Const \
perl-Class--Date--Invalid \
perl-Class--Date--Rel \
perl-Class-Date"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
