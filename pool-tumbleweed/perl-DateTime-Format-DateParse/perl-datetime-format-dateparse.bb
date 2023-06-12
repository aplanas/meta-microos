SUMMARY = "Parses Date::Parse compatible formats"
DESCRIPTION = "This module is a compatibility wrapper around Date::Parse. \
 \
  Author:	Joshua Hoblitt (JHOBLITT) <jhoblitt@cpan.org>"
LICENSE = "GPL-2.0 | Artistic-1.0"

PV = "0.05"

RPM_NAME = "perl-DateTime-Format-DateParse-0.05-22.24.noarch.rpm"
RPM_HASH = "62fdc5320c3a5662cbf3ef0788a5a229cb6b03c4cffbc2c26dc5c1e50d1de383b6fd63c7572331ad8daf07fc10446ec2c9526f0a2246e4aa79d6a5af56e7a8a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DateTime::Format::DateParse) \
perl-DateTime-Format-DateParse"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Date::Parse) \
perl(DateTime) \
perl(DateTime::Locale) \
perl(DateTime::TimeZone) \
perl(Time::Zone)"

inherit rpm
