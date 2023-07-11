SUMMARY = "File-finding iterator"
DESCRIPTION = "File-finding iterator"
LICENSE = "Artistic-2.0"

PV = "1.18"

RPM_NAME = "perl-File-Next-1.18-1.16.aarch64.rpm"
RPM_HASH = "23b433c16035da9f466df17cd7d0612cdd335deb3be52a1530d600ac95f1afc126e0494a3faf4bc8762041859977f5819fb7dc5739294e82a157f2a158d937aa"

RPROVIDES:${PN} += "perl-File--Next \
perl-File-Next"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Temp \
perl-Test--More"

inherit rpm
