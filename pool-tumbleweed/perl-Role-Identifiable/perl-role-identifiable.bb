SUMMARY = "Thing you can identify somehow"
DESCRIPTION = "Role::Identifiable isn't really a module that does anything. It's here to \
make things simpler for indexing on CPAN and looking up docs. \
 \
You probably want to use either Role::Identifiable::HasIdent, for \
identifying things by an identifier string, or Role::Identifiable::HasTags \
for identifying things by a list of tags."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-Role-Identifiable-0.009-1.3.noarch.rpm"
RPM_HASH = "9a47d0a13235d2c0110881f681fbc7cdfe39f9159f908c62e69c180dcd0f728e271d5bc2ee9e2cf9d0ba192891a5a700f57235de8c32adebbf44af0e4c471a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--Identifiable \
perl-Role--Identifiable--HasIdent \
perl-Role--Identifiable--HasTags \
perl-Role-Identifiable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints"

inherit rpm
