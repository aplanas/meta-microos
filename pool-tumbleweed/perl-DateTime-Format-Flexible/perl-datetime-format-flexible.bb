SUMMARY = "DateTime::Format::Flexible - Flexibly parse strings and turn them into D[cut]"
DESCRIPTION = "If you have ever had to use a program that made you type in the date a \
certain way and thought 'Why can't the computer just figure out what date I \
wanted?', this module is for you. \
 \
_DateTime::Format::Flexible_ attempts to take any string you give it and \
parse it into a DateTime object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.34"

RPM_NAME = "perl-DateTime-Format-Flexible-0.34-1.9.noarch.rpm"
RPM_HASH = "0a743341cfcd97bbe1fb19204b6d9f909c4e8b72cbb0b19018a41503011235dd90e86863a362f98cf9296ec34ec5396d7249164bf284bda10184cfcb9863f74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DateTime::Format::Flexible) \
perl(DateTime::Format::Flexible::lang) \
perl(DateTime::Format::Flexible::lang::de) \
perl(DateTime::Format::Flexible::lang::en) \
perl(DateTime::Format::Flexible::lang::es) \
perl-DateTime-Format-Flexible"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DateTime) \
perl(DateTime::Format::Builder) \
perl(DateTime::TimeZone) \
perl(List::MoreUtils)"

inherit rpm
