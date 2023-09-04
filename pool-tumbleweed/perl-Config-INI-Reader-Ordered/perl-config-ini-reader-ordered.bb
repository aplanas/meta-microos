SUMMARY = ".ini-file parser that returns sections in order"
DESCRIPTION = "Config::INI::Reader::Ordered is a subclass of Config::INI::Reader which \
preserves section order. See Config::INI::Reader for all documentation; the \
only difference is as presented in the SYNOPSIS."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.022"

RPM_NAME = "perl-Config-INI-Reader-Ordered-0.022-1.4.noarch.rpm"
RPM_HASH = "6004b54013514b53c788a7fc746108f25a69bee9c8bbba5416a000c2b5af23239ec9a84ea6e2c5a8cc5e606a41e890ff86758a3927dd10d8f52014087578262a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--INI--Reader--Ordered \
perl-Config-INI-Reader-Ordered"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Config--INI--Reader"

inherit rpm
