SUMMARY = "Simple Eyecandy ASCII Tables"
DESCRIPTION = "Simple eyecandy ASCII tables."
LICENSE = "Artistic-2.0"

PV = "2.07"

RPM_NAME = "perl-Text-SimpleTable-2.07-1.10.noarch.rpm"
RPM_HASH = "40c16d3a58b5e4ad863ef42a082283e4e4e2a71e4da6c6c743e76e21e482e15470b33d23f510e4c8d36d803ce062b7a293d5d7cabcec2b35811ab2e837a355e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--SimpleTable \
perl-Text-SimpleTable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
