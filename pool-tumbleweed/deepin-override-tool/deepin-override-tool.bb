SUMMARY = "Deepin override tool"
DESCRIPTION = "This is a tool for Deepin to creat schemas override profiles."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.11"

RPM_NAME = "deepin-override-tool-5.10.11-2.2.aarch64.rpm"
RPM_HASH = "4730eb4af4df03cc9296a336cda85cbea93bd7a9f3f5943c3c00ce7a2acd6771633076908cc8e880926174344a562561a50268087b91a8b397e9f79e9f985bf5"

RPROVIDES:${PN} += "deepin-override-tool"

RDEPENDS:${PN} += "dconf"

inherit rpm
