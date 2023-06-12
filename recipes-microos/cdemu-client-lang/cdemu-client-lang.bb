SUMMARY = "Translations for package cdemu-client"
DESCRIPTION = "Provides translations for the 'cdemu-client' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "cdemu-client-lang-3.2.5-1.6.noarch.rpm"
RPM_HASH = "935e35709cc294993f115e5a6772a45bbe81c77002b6f09027deadc042ecd05ae042217b6ec90ba75ee3d4fdbdb271ce6045a6770ab11648f5a3fd14dbdc0c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cdemu-client-lang \
cdemu-client-lang-all \
locale(cdemu-client:de) \
locale(cdemu-client:fr) \
locale(cdemu-client:pl) \
locale(cdemu-client:ru) \
locale(cdemu-client:sl) \
locale(cdemu-client:sv)"
RDEPENDS:${PN} += "cdemu-client"

inherit rpm
