SUMMARY = "DMD compatible wrapper for the GDC D compiler"
DESCRIPTION = "GDMD is a wrapper for the GDC D compiler to provide a DMD compatible interface."
LICENSE = "BSL-1.0"

PV = "20210818T144245"

RPM_NAME = "gdmd-20210818T144245-1.4.noarch.rpm"
RPM_HASH = "3c8b581267eb1468d4623e9a398d9d0904ad8b81ba29abce5bb9972ff390ae13cdb354d5822a3056569f4de4b26de7afb501f44f78c363b56cfe7f24548f77a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdmd"

RDEPENDS:${PN} += "/usr/bin/perl \
gcc-d"

inherit rpm
