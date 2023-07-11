SUMMARY = ".ini-file parser that returns sections in order"
DESCRIPTION = "Config::INI::Reader::Ordered is a subclass of Config::INI::Reader which \
preserves section order. See Config::INI::Reader for all documentation; the \
only difference is as presented in the SYNOPSIS."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.022"

RPM_NAME = "perl-Config-INI-Reader-Ordered-0.022-1.3.noarch.rpm"
RPM_HASH = "6dccd105a71c8ca3cb25ad399560597e617ea131d4b78924ae54535139f2e660d35f7604becb0b046344cae1026044894018006a1c4805ec407b2dba46adf8c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--INI--Reader--Ordered \
perl-Config-INI-Reader-Ordered"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Config--INI--Reader"

inherit rpm
