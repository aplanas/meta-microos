SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-doc-253.7-2.1.aarch64.rpm"
RPM_HASH = "b9ba5f6d5f3887a93ded9f7695ca02ffebcfdcc72646087e5b5c4234276fdffdfdbac70f1f09747d859d89e6209c2ace6105bee947ee7ca80ef29062c244f35e"

RPROVIDES:${PN} += "systemd-doc"

RDEPENDS:${PN} += ""

inherit rpm
