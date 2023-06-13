SUMMARY = "Developer Documentation for tumbler"
DESCRIPTION = "This package provides the developer documentation for tumbler."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "tumbler-doc-4.18.1-1.1.noarch.rpm"
RPM_HASH = "335289b90c1cb2ecb5d8337780bd6361ca0a89136647b6237bd4a037d09162f640a9817ccd7e833c975b4b2a474680be25233f731e1fa451c8980ae36b3ff1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tumbler-doc"

RDEPENDS:${PN} += ""

inherit rpm
