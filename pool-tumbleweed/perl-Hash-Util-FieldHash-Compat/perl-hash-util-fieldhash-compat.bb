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

RPM_NAME = "perl-Hash-Util-FieldHash-Compat-0.11-1.24.noarch.rpm"
RPM_HASH = "b4a34db7897e52ec7dedfa7bf3c879b8bbd327b632c9fca0b9e48446a79753ecea10767dccc28bd782f568d1a4f1540a2c86e122393099d4b67c0de6832d0277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Util--FieldHash--Compat \
perl-Hash--Util--FieldHash--Compat--Heavy \
perl-Hash-Util-FieldHash-Compat"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
