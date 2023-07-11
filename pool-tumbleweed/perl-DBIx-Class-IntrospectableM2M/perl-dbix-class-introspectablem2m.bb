SUMMARY = "Introspect many-to-many shortcuts"
DESCRIPTION = "Because the many-to-many relationships are not real relationships, they can \
not be introspected with DBIx::Class. Many-to-many relationships are \
actually just a collection of convenience methods installed to bridge two \
relationships. This DBIx::Class component can be used to store all relevant \
information about these non-relationships so they can later be introspected \
and examined."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.001002"

RPM_NAME = "perl-DBIx-Class-IntrospectableM2M-0.001002-2.20.noarch.rpm"
RPM_HASH = "bc4f70388b01ed9686af4e4dcbcb2173dc2846e486979e36acb72ca5ea8158f9205be600ae7000543a4adc004e38150e8a7606d487db594114f524a1791692ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--IntrospectableM2M \
perl-DBIx-Class-IntrospectableM2M"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBIx--Class"

inherit rpm
