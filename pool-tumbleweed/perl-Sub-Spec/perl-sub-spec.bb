SUMMARY = "Subroutine metadata specification"
DESCRIPTION = "Subroutine metadata specification"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.0.7"

RPM_NAME = "perl-Sub-Spec-1.0.7-9.26.noarch.rpm"
RPM_HASH = "ecdb749c49dffe9faa9aa17f496bdadbe583f0b61a22f7691b5a728f804585819e22f7d3a54faa045983991d7ede620477d774d92f5a2911e2ffdcdf9d3d588a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Spec \
perl-Sub--Spec--Schema \
perl-Sub--Spec--Util \
perl-Sub-Spec"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Which \
perl-Log--Any \
perl-Probe--Perl \
perl-Test--More"

inherit rpm
