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

RPM_NAME = "perl-Dancer2-Plugin-DBIC-0.0100-1.11.noarch.rpm"
RPM_HASH = "31c8641c6f79dfc9b16f443981c7b32b75eec2bb3fe644dc9e0de00c078222cefdb95f6ae10b4d4a202021392f34828fdf7ce9208281df23a9d9835d7a20e36d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--DBIC \
perl-Dancer2-Plugin-DBIC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-DBICx--Sugar \
perl-Dancer2 \
perl-Dancer2--Plugin"

inherit rpm
