SUMMARY = "SystemTap dtrace utility"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the dtrace utility to build provider and probe \
definitions."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-dtrace-4.9-1.1.noarch.rpm"
RPM_HASH = "2bce19e62c60c3a593131b6f58d0c7f424c5abd5c39b3c0cd8e029ac312c2a49fdc294652e74fcdcdacdfcbaca5e653de28115947ac548ccda7d4b6f68f73a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemtap-dtrace"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
