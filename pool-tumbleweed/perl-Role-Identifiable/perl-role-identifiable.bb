SUMMARY = "Thing you can identify somehow"
DESCRIPTION = "Role::Identifiable isn't really a module that does anything. It's here to \
make things simpler for indexing on CPAN and looking up docs. \
 \
You probably want to use either Role::Identifiable::HasIdent, for \
identifying things by an identifier string, or Role::Identifiable::HasTags \
for identifying things by a list of tags."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-Role-Identifiable-0.009-1.4.noarch.rpm"
RPM_HASH = "dc502da74b0476dd2aba7eff967e886204940f477ea28b978903e0e9933ac5e5c8b05e59973ff4abedd4e1560e633a40de1fee2f50b8fb77176848bd0ba63365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--Identifiable \
perl-Role--Identifiable--HasIdent \
perl-Role--Identifiable--HasTags \
perl-Role-Identifiable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints"

inherit rpm
