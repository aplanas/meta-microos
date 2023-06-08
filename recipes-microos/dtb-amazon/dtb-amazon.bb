SUMMARY = "Amazon based arm64 systems"
DESCRIPTION = "Device Tree files for Amazon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-amazon-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "42101c5cf3e56dc18621288a58da9a20bdd32a48fc2b025b4e86bf222c01b756ae35459c2eea88b78d4d8a6e8629c343f8fe177c477071f12346c918173c5093"

RPROVIDES:${PN} += "dtb-al dtb-amazon dtb-amazon(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
