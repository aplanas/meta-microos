SUMMARY = "Developer documentation for fwupd"
DESCRIPTION = "Developer documentation for fwupd."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.12"

RPM_NAME = "fwupd-doc-1.8.12-1.3.noarch.rpm"
RPM_HASH = "0e9431cf6805d757a64fa77dba4eff751e93420de5ab107122dea63395de7208240e7f17a89c79f21ea67131cc0b4b66760f45b554875c98309ac9d600839642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-doc"
RDEPENDS:${PN} += ""

inherit rpm
