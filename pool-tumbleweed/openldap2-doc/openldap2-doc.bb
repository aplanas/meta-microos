SUMMARY = "OpenLDAP Documentation"
DESCRIPTION = "The OpenLDAP Admin Guide plus a set of OpenLDAP related IETF internet drafts."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-doc-2.6.4-2.2.noarch.rpm"
RPM_HASH = "3ca00bc7dd281ca079102c34fae7f220c91a79ab53647a431e69e4ccb50ada0e09f90e64104ebcafec95a6b2f263ad64d7d1f47befe357edff3050234b1e6aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openldap2-/usr/share/doc/packages/openldap2/drafts/README \
openldap2-doc"

RDEPENDS:${PN} += ""

inherit rpm
