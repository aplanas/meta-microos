SUMMARY = "Subroutine metadata specification"
DESCRIPTION = "Subroutine metadata specification"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.0.7"

RPM_NAME = "perl-Sub-Spec-1.0.7-9.27.noarch.rpm"
RPM_HASH = "620d284642a38fe32e546bb2a3e7c870ec084fb192d373db010e9019bbd05aaae74290b8bb7b035a0435c850e4917018da0dc3730bb682a93c7229d620b06fab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Spec \
perl-Sub--Spec--Schema \
perl-Sub--Spec--Util \
perl-Sub-Spec"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Which \
perl-Log--Any \
perl-Probe--Perl \
perl-Test--More"

inherit rpm
