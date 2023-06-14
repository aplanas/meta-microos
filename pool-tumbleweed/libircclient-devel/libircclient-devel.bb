SUMMARY = "Header files and libraries for compiling against libircclient"
DESCRIPTION = "It is designed to be small, fast, portable and compatible to RFC standards and most IRC clients."
LICENSE = "LGPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "libircclient-devel-1.10-1.14.aarch64.rpm"
RPM_HASH = "bb0cce6f239bb72b385f76bf62a5146897baf20d3f3f9dc09ca8f779d05881729eccefd5dc64b34a4aeb67c03bc3762de0653f36d35f3c168d1441472d9aabf5"

RPROVIDES:${PN} += "libircclient-devel"

RDEPENDS:${PN} += "libircclient1"

inherit rpm
