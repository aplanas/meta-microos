SUMMARY = "OpenLDAP Documentation"
DESCRIPTION = "The OpenLDAP Admin Guide plus a set of OpenLDAP related IETF internet drafts."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-doc-2.6.4-1.1.noarch.rpm"
RPM_HASH = "d03c33db699167491b89fa12f7a39c94c2e18114d8aa9468e7f4858097b3406bd1d54ac2bc69a0456c1b91cba5ac62931c29580fddd6efb2547b2bc7603f2cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openldap2-doc \
openldap2:/usr/share/doc/packages/openldap2/drafts/README"

RDEPENDS:${PN} += ""

inherit rpm
