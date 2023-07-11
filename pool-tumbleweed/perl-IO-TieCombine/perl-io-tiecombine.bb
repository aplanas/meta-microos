SUMMARY = "Produce Tied (and Other) Separate but Combined Variables"
DESCRIPTION = "produce tied (and other) separate but combined variables"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.005"

RPM_NAME = "perl-IO-TieCombine-1.005-1.27.noarch.rpm"
RPM_HASH = "f46424a89e791c4406547c234845f281dfb4c2455154d6026ea4001f228acf9171030a954a20a1633bffc681b382df88af2b6da0af4b7f80832d9ae8cb34cf33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--TieCombine \
perl-IO--TieCombine--Handle \
perl-IO--TieCombine--Scalar \
perl-IO-TieCombine"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
