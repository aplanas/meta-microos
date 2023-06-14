SUMMARY = "Libraries and header files to develop programs with libadns support"
DESCRIPTION = "Libadns-devel includes the header file and static library to develop \
programs with libads support."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libadns-devel-1.6.0-1.12.aarch64.rpm"
RPM_HASH = "bfba3b9fb1e5816aab855b41f216fbeed48103b1f1148c0e8fb0664d9af5bff455d924f9511c6f389e511170dbec36899d03bf02dac00b15287979f561130405"

RPROVIDES:${PN} += "libadns-devel"

RDEPENDS:${PN} += "glibc-devel \
libadns1"

inherit rpm
