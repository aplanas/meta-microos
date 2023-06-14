SUMMARY = "Perl YAML Serialization using XS and libyaml"
DESCRIPTION = "Perl YAML Serialization using XS and libyaml"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.88"

RPM_NAME = "perl-YAML-LibYAML-0.88-1.1.aarch64.rpm"
RPM_HASH = "f9155bf9be48f109caab3ada263e0297b2b33973c51459f1fe329538384250512586caff74aac7746866f2893c7f60633c326af8be2ee12b049d56779780c961"

RPROVIDES:${PN} += "perl-YAML--LibYAML \
perl-YAML--XS \
perl-YAML--XS--LibYAML \
perl-YAML-LibYAML"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
