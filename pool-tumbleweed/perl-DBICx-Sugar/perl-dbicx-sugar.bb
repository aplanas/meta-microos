SUMMARY = "Just some syntax sugar for DBIx::Class"
DESCRIPTION = "Just some syntax sugar for your DBIx::Class applications. This was \
originally created to remove code duplication between Dancer::Plugin::DBIC \
and Dancer2::Plugin::DBIC."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0200"

RPM_NAME = "perl-DBICx-Sugar-0.0200-1.11.noarch.rpm"
RPM_HASH = "f8e9b812a970100dc9e874575cb1ddee87f50b9e52679099267de4164cd52f359cef02232441dabce01c3d3b035d4020dd809e5fcc60682a14b489da3f9db910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBICx::Sugar) \
perl-DBICx-Sugar"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DBIx::Class) \
perl(Module::Load) \
perl(SQL::Translator) \
perl(YAML)"

inherit rpm
