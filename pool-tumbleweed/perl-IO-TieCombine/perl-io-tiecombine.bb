SUMMARY = "Produce Tied (and Other) Separate but Combined Variables"
DESCRIPTION = "produce tied (and other) separate but combined variables"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.005"

RPM_NAME = "perl-IO-TieCombine-1.005-1.28.noarch.rpm"
RPM_HASH = "aae2814f961add08f3dc29496619a00283e7ae24e4356f4c35a3655dbe94071b9a60805fa9c1b4429d1e307d8934887de8cb8e536bfdd22268abb29493a5c97b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--TieCombine \
perl-IO--TieCombine--Handle \
perl-IO--TieCombine--Scalar \
perl-IO-TieCombine"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
