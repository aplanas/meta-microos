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

RPM_NAME = "perl-YAML-1.30-1.14.noarch.rpm"
RPM_HASH = "c13534bfbc874b30925d8ae2f9f68a616530e0d92e59f0531803ba395015f148d99c0abce386e35e2089fd02c2471194b5085ab586ab35fd539cc7d602415523"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
