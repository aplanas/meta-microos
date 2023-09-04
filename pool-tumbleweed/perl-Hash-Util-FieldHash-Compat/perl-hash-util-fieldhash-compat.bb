SUMMARY = "Use Hash::Util::FieldHash or ties, depending on availability"
DESCRIPTION = "Under older perls this module provides a drop-in compatible API to \
Hash::Util::FieldHash using perltie. When Hash::Util::FieldHash is \
available it will use that instead. \
 \
This way code requiring field hashes can benefit from fast, robust field \
hashes on Perl 5.10 and newer, but still run on older perls that don't ship \
with that module. \
 \
See Hash::Util::FieldHash for all the details of the API."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Hash-Util-FieldHash-Compat-0.11-1.25.noarch.rpm"
RPM_HASH = "e4e5441a0281eace84bbdf96ce6368d75ba24f3d0e96d23f2ab72144c198b1a3b3bb41e4d33d0d06f32a6a99bfa8c31ea804aeb974d70069906cffd4d8657c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Util--FieldHash--Compat \
perl-Hash--Util--FieldHash--Compat--Heavy \
perl-Hash-Util-FieldHash-Compat"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
