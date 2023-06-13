SUMMARY = "Simple sprintf-like dialect"
DESCRIPTION = "String::Errf provides 'errf', a simple string formatter that works \
something like 'sprintf'. It is implemented using String::Formatter and \
Sub::Exporter. Their documentation may be useful in understanding or \
extending String::Errf. The 'errf' subroutine is only available when \
imported. Calling String::Errf::errf will not do what you want."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-String-Errf-0.009-1.2.noarch.rpm"
RPM_HASH = "ca1076258511b306facc05d5703ba38d189b73e688601620c99af81fbf4027d092d7bbee6561a73fe3552a52359a27f126e89b2d7d2999b3f1cb1150c252a4b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(String::Errf) \
perl-String-Errf"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Params::Util) \
perl(String::Formatter) \
perl(Sub::Exporter) \
perl(Time::Piece) \
perl(parent)"

inherit rpm
