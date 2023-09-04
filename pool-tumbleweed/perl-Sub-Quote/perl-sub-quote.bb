SUMMARY = "Efficient generation of subroutines via string eval"
DESCRIPTION = "This package provides performant ways to generate subroutines from strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.006008"

RPM_NAME = "perl-Sub-Quote-2.006008-1.3.noarch.rpm"
RPM_HASH = "03cd535b3fb81a5d732c563a3ab3b2de3544468b7c8efe416b4814acd2abc0a620e78649e0b04fbf4d4e0ed3cf853a8fb8e8730cbec688e2d5e86eb24c67007e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Defer \
perl-Sub--Quote \
perl-Sub-Quote"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
