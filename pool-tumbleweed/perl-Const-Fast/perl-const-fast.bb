SUMMARY = "Facility for creating read-only scalars, arrays, and hashes"
DESCRIPTION = "Facility for creating read-only scalars, arrays, and hashes"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.014"

RPM_NAME = "perl-Const-Fast-0.014-1.27.noarch.rpm"
RPM_HASH = "de247eaf4f500d168d49d6cdbdc2d7859c59916376456361e98984597a99f534ac2f3c2b3ded32a57c8bd7c30fc30eb0b72acbbf1272c53b944439f9a67c8158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Const--Fast \
perl-Const-Fast"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Sub--Exporter--Progressive"

inherit rpm
