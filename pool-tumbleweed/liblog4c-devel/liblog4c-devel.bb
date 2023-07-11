SUMMARY = "Development files for log4c"
DESCRIPTION = "The liblog4c-devel package contains the static libraries and header \
files needed for development with log4c."
LICENSE = "LGPL-2.1+"

PV = "1.2.4"

RPM_NAME = "liblog4c-devel-1.2.4-5.27.aarch64.rpm"
RPM_HASH = "8657190ed654ad9c08ec676d0d4bfda4418f902ee815123774657d110d466397923a36eec10f073ccb196624c73eb8f0ff1e6867916c954f42eb2f2544fe65ae"

RPROVIDES:${PN} += "liblog4c-devel \
pkgconfig-log4c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
liblog4c3"

inherit rpm
