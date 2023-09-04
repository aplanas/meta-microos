SUMMARY = "Dates in the Julian calendar"
DESCRIPTION = "DateTime::Calendar::Julian implements the Julian Calendar. This module \
implements all methods of DateTime; see the DateTime(3) manpage for all \
methods."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.107"

RPM_NAME = "perl-DateTime-Calendar-Julian-0.107-1.9.noarch.rpm"
RPM_HASH = "63ed57519392d38d61afb30d67477c9a9cc84d8a42fd6ce89eaa0ece0a0f179e5ac1ad8e79bd1ca7c3be9a0deb69a422ca9815473204062580bc3ab6ae02841e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Calendar--Julian \
perl-DateTime-Calendar-Julian"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime"

inherit rpm
