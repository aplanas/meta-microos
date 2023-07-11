SUMMARY = "Faster parsing for YAML::PP"
DESCRIPTION = "YAML::PP::LibYAML is a subclass of YAML::PP. Instead of using \
YAML::PP::Parser as a the backend parser, it uses YAML::PP::LibYAML::Parser \
which calls YAML::LibYAML::API, an XS wrapper around the 'C libyaml'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-YAML-PP-LibYAML-0.005-1.13.noarch.rpm"
RPM_HASH = "bb9c7decb8617a2a575110d00cb796395d33be3ad65b9a2cbfc7d84a347c34027ab246f05e2e30e53da9f80f5066b3e5eef9ade519b42803a1400fe01f288f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML--PP--LibYAML \
perl-YAML--PP--LibYAML--Emitter \
perl-YAML--PP--LibYAML--Parser \
perl-YAML-PP-LibYAML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-YAML--LibYAML--API \
perl-YAML--LibYAML--API--XS \
perl-YAML--PP \
perl-YAML--PP--Emitter \
perl-YAML--PP--Parser \
perl-YAML--PP--Reader \
perl-YAML--PP--Writer"

inherit rpm
