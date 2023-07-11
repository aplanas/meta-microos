SUMMARY = "Samples for javassist"
DESCRIPTION = "Samples for javassist. \
 \
Samples for javassist."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.29.2"

RPM_NAME = "javassist-demo-3.29.2-2.1.noarch.rpm"
RPM_HASH = "897b9c306e77b3fa1ffae20650a372aa74046787b93f54877aa79bfc27bc643d7af1af6c171afb045a09e8013256cd9a034053a765aeb51cea4bfae4274edd5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist-demo"

RDEPENDS:${PN} += "javassist"

inherit rpm
