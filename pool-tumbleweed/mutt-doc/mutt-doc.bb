SUMMARY = "Additional Documentation about Mutt"
DESCRIPTION = "Some extend documentation about mutt together with muttrc examples \
for different environments and requirements."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.10"

RPM_NAME = "mutt-doc-2.2.10-2.2.noarch.rpm"
RPM_HASH = "6ca81919c36d8a6b4780121b770e4998f1af84f62e932edc04b9b47f22106944675252488d00c4076b1768aca323a234b7190f62801e92bc82566a501aceb4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-/usr/share/doc/packages/mutt/COPYRIGHT \
mutt-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
mutt"

inherit rpm
