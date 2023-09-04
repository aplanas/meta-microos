SUMMARY = "YAML Ain't Markup Language™"
DESCRIPTION = "The YAML.pm module implements a YAML Loader and Dumper based on the YAML \
1.0 specification. http://www.yaml.org/spec/ \
 \
YAML is a generic data serialization language that is optimized for human \
readability. It can be used to express the data structures of most modern \
programming languages. (Including Perl!!!) \
 \
For information on the YAML syntax, please refer to the YAML specification."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.30"

RPM_NAME = "perl-YAML-1.30-1.15.noarch.rpm"
RPM_HASH = "772ae9d4304494daa32da221d0593834e3b82833207e0091fbf37fc8f6b0d14a89c26e9587b3e42aaf07993e45af7c2c07e4bcd19e3a034712085b49ca853d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML \
perl-YAML--Any \
perl-YAML--Dumper \
perl-YAML--Dumper--Base \
perl-YAML--Error \
perl-YAML--Loader \
perl-YAML--Loader--Base \
perl-YAML--Marshall \
perl-YAML--Mo \
perl-YAML--Node \
perl-YAML--Tag \
perl-YAML--Type--blessed \
perl-YAML--Type--code \
perl-YAML--Type--glob \
perl-YAML--Type--ref \
perl-YAML--Type--regexp \
perl-YAML--Type--undef \
perl-YAML--Types \
perl-YAML--Warning \
perl-yaml-mapping \
perl-yaml-scalar \
perl-yaml-sequence"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
