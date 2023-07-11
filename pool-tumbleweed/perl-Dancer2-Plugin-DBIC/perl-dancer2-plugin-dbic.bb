SUMMARY = "DBIx::Class interface for Dancer2 applications"
DESCRIPTION = "This plugin makes it very easy to create Dancer2 applications that \
interface with databases. It automatically exports the keyword 'schema' \
which returns a DBIx::Class::Schema object. It also exports the keywords \
'resultset' and 'rset'. You just need to configure your database connection \
information. For performance, schema objects are cached in memory and are \
lazy loaded the first time they are accessed. \
 \
This plugin is a thin wrapper around DBICx::Sugar."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0100"

RPM_NAME = "perl-Dancer2-Plugin-DBIC-0.0100-1.12.noarch.rpm"
RPM_HASH = "5b2247bc3a1b20b626766f2b477074fd5df2d33e7d6c2886f57a39429ca27b1c69739c56ac97aeb98f9e96265093aaac2f0634f0e13176ce2aa05f3ab98b7d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--DBIC \
perl-Dancer2-Plugin-DBIC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBICx--Sugar \
perl-Dancer2 \
perl-Dancer2--Plugin"

inherit rpm
