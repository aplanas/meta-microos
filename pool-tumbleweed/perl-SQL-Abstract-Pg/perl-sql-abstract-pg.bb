SUMMARY = "PostgreSQL features for SQL::Abstract"
DESCRIPTION = "SQL::Abstract::Pg extends SQL::Abstract with a few PostgreSQL features used \
by Mojo::Pg."
LICENSE = "Artistic-2.0"

PV = "1.0"

RPM_NAME = "perl-SQL-Abstract-Pg-1.0-1.11.noarch.rpm"
RPM_HASH = "d8e30404f0566f4b556f3ff22f8c80c29e503f2de9057957764a166b528ffc1c53e654c75cfa5c6caa9cbdab1911536f1e45d567a8a53ba228ef40d5eba542b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--Abstract--Pg \
perl-SQL-Abstract-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-SQL--Abstract"

inherit rpm
