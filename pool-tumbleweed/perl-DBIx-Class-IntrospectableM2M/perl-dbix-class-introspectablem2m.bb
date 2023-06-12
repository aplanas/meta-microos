SUMMARY = "Introspect many-to-many shortcuts"
DESCRIPTION = "Because the many-to-many relationships are not real relationships, they can \
not be introspected with DBIx::Class. Many-to-many relationships are \
actually just a collection of convenience methods installed to bridge two \
relationships. This DBIx::Class component can be used to store all relevant \
information about these non-relationships so they can later be introspected \
and examined."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.001002"

RPM_NAME = "perl-DBIx-Class-IntrospectableM2M-0.001002-2.19.noarch.rpm"
RPM_HASH = "686c8ca73291e3182170945ab9f866c55280ae4e4123ece59674fb7d74e61d6ec7f0055517d7cfe9126a6876ef53ddab7d14ef42bc718e4ffcd80eceb6fcdb61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBIx::Class::IntrospectableM2M) \
perl-DBIx-Class-IntrospectableM2M"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DBIx::Class)"

inherit rpm
