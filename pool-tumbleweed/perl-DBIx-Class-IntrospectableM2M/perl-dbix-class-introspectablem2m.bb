SUMMARY = "Introspect many-to-many shortcuts"
DESCRIPTION = "Because the many-to-many relationships are not real relationships, they can \
not be introspected with DBIx::Class. Many-to-many relationships are \
actually just a collection of convenience methods installed to bridge two \
relationships. This DBIx::Class component can be used to store all relevant \
information about these non-relationships so they can later be introspected \
and examined."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.001002"

RPM_NAME = "perl-DBIx-Class-IntrospectableM2M-0.001002-2.21.noarch.rpm"
RPM_HASH = "d0a6e216b80b98dd79a5657ef1708b8c64b3da3e2e79329d989573adb6ebe67123556e62654189af5f1a0a7ed4950d447d6c195a4aae79d2f5eed14470d21185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--IntrospectableM2M \
perl-DBIx-Class-IntrospectableM2M"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBIx--Class"

inherit rpm
