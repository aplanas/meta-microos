SUMMARY = "Faster parsing for YAML::PP"
DESCRIPTION = "YAML::PP::LibYAML is a subclass of YAML::PP. Instead of using \
YAML::PP::Parser as a the backend parser, it uses YAML::PP::LibYAML::Parser \
which calls YAML::LibYAML::API, an XS wrapper around the 'C libyaml'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-YAML-PP-LibYAML-0.005-1.12.noarch.rpm"
RPM_HASH = "0b1c14d052cce8342034d02a40834abb097101e6663a26f7220a63b6c5f55cc0bf23d974b69c9a5ac73b18759765f3422e8344e59f64fb347ae33616780d4d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML--PP--LibYAML \
perl-YAML--PP--LibYAML--Emitter \
perl-YAML--PP--LibYAML--Parser \
perl-YAML-PP-LibYAML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-YAML--LibYAML--API \
perl-YAML--LibYAML--API--XS \
perl-YAML--PP \
perl-YAML--PP--Emitter \
perl-YAML--PP--Parser \
perl-YAML--PP--Reader \
perl-YAML--PP--Writer"

inherit rpm
