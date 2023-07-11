SUMMARY = "Compare elements of two or more lists"
DESCRIPTION = "Compare elements of two or more lists"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.55"

RPM_NAME = "perl-List-Compare-0.55-1.13.noarch.rpm"
RPM_HASH = "4822edaa00d1d1c2a60de3bea12ecd998e3b520319d55fbc27582d76331e9fede251dedd1c71b66a09a2577ee26cd3b11fda9216b69306c5ebf45cf0b01657d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--Compare \
perl-List--Compare--Accelerated \
perl-List--Compare--Base---Auxiliary \
perl-List--Compare--Base---Engine \
perl-List--Compare--Functional \
perl-List--Compare--Multiple \
perl-List--Compare--Multiple--Accelerated \
perl-List-Compare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
