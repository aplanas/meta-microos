SUMMARY = "PostgreSQL features for SQL::Abstract"
DESCRIPTION = "SQL::Abstract::Pg extends SQL::Abstract with a few PostgreSQL features used \
by Mojo::Pg."
LICENSE = "Artistic-2.0"

PV = "1.0"

RPM_NAME = "perl-SQL-Abstract-Pg-1.0-1.12.noarch.rpm"
RPM_HASH = "f4839f8b2fe6aad62b3c9d26e7d46a99c2314d36f852998311c4ef5a9b6e66ba943c4cac731de44f67fdf3455c4b06b5328c83bd1595d6ff4fbd007ced2721c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--Abstract--Pg \
perl-SQL-Abstract-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-SQL--Abstract"

inherit rpm
