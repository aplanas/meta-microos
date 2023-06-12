SUMMARY = "Documentation and examples for the Qore openldap module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
openldap module."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "qore-openldap-module-doc-1.2-1.3.aarch64.rpm"
RPM_HASH = "df5482054fec038525c99c68b1c8b9fb5bbb80fe7fcb0864974ead603ffbd66cd4565b7c2cde531a2e219ea4ab98c3bc9cce8a5069f2b4178e4e6e6157c77a75"

RPROVIDES:${PN} += "qore-openldap-module-doc \
qore-openldap-module-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
