SUMMARY = "Perl YAML Serialization using XS and libyaml"
DESCRIPTION = "Perl YAML Serialization using XS and libyaml"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.88"

RPM_NAME = "perl-YAML-LibYAML-0.88-1.3.aarch64.rpm"
RPM_HASH = "6930b3f80c26a96bf65a75bf0c071a59c2fee50cddfb2506f1bbc632150daa1cf05b50e281110aed6de35f38d95917ba51ca8a7dd9e4039785582b89c747e437"

RPROVIDES:${PN} += "perl-YAML--LibYAML \
perl-YAML--XS \
perl-YAML--XS--LibYAML \
perl-YAML-LibYAML"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
