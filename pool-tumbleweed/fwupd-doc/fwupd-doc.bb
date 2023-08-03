SUMMARY = "Developer documentation for fwupd"
DESCRIPTION = "Developer documentation for fwupd."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.17"

RPM_NAME = "fwupd-doc-1.8.17-1.1.noarch.rpm"
RPM_HASH = "12f1df2ba6a8d8773ce121ff09b4e39ff0028205f85f4408c347dc984450eedab21e53a6c846fcc3cb03e7d74c54e9e74a260f026c480df07e9897548685511a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-doc"

RDEPENDS:${PN} += ""

inherit rpm
