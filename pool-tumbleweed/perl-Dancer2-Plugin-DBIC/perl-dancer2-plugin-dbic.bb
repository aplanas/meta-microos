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

RPM_NAME = "perl-Dancer2-Plugin-DBIC-0.0100-1.13.noarch.rpm"
RPM_HASH = "135e377df9a793d297443b09d75182e41ae78ee1e8cd055acf7c9953751884ffb0f698e786282afc08c43665057711802159f77738d7178af099df2d1e4470b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--DBIC \
perl-Dancer2-Plugin-DBIC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBICx--Sugar \
perl-Dancer2 \
perl-Dancer2--Plugin"

inherit rpm
