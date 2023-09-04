SUMMARY = "Faster parsing for YAML::PP"
DESCRIPTION = "YAML::PP::LibYAML is a subclass of YAML::PP. Instead of using \
YAML::PP::Parser as a the backend parser, it uses YAML::PP::LibYAML::Parser \
which calls YAML::LibYAML::API, an XS wrapper around the 'C libyaml'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-YAML-PP-LibYAML-0.005-1.14.noarch.rpm"
RPM_HASH = "55efa212d2aa413d96a2b1a5b1d656e385300176890533407ccec8464daa83565f4a65c548df43a07460a49dc552a326b0dcac0e1d5e60e247eeea36d090a38d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML--PP--LibYAML \
perl-YAML--PP--LibYAML--Emitter \
perl-YAML--PP--LibYAML--Parser \
perl-YAML-PP-LibYAML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-YAML--LibYAML--API \
perl-YAML--LibYAML--API--XS \
perl-YAML--PP \
perl-YAML--PP--Emitter \
perl-YAML--PP--Parser \
perl-YAML--PP--Reader \
perl-YAML--PP--Writer"

inherit rpm
