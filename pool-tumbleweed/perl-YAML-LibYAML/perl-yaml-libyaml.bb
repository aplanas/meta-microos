SUMMARY = "Perl YAML Serialization using XS and libyaml"
DESCRIPTION = "Perl YAML Serialization using XS and libyaml"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.88"

RPM_NAME = "perl-YAML-LibYAML-0.88-1.2.aarch64.rpm"
RPM_HASH = "f79b798cd169888d61a856c8d9855e4d74ae27ccc914c0f7b3e329b950ce45b96074af415f82be00b669c535ffb4dfe229fd992e47ed079657ae276c1db96249"

RPROVIDES:${PN} += "perl-YAML--LibYAML \
perl-YAML--XS \
perl-YAML--XS--LibYAML \
perl-YAML-LibYAML"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
