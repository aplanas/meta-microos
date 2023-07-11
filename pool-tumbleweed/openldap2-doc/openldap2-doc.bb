SUMMARY = "OpenLDAP Documentation"
DESCRIPTION = "The OpenLDAP Admin Guide plus a set of OpenLDAP related IETF internet drafts."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-doc-2.6.4-2.1.noarch.rpm"
RPM_HASH = "879fea66cf4a279c810013e58eb808219d9372ddb5a280886c2ee794f9d48e68022e0c54476d4fc4bcf5eeb18c58c37647980fdbfe01154734f3835a1a44faa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openldap2-/usr/share/doc/packages/openldap2/drafts/README \
openldap2-doc"

RDEPENDS:${PN} += ""

inherit rpm
