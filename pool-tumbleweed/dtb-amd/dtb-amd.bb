SUMMARY = "AMD based arm64 systems"
DESCRIPTION = "Device Tree files for AMD based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-amd-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "273c0ad07f1af5e6bcd3385a7fb1da3f2a934023b633594fabca64bf2e39198b7c7076029c1031cc359638096efaf244dfb69baf3077511b60669266ca22d45e"

RPROVIDES:${PN} += "dtb-amd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
