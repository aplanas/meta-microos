SUMMARY = "Headers and Libraries for building applications using munge"
DESCRIPTION = "A header file and libraries for building applications using the munge \
authenication service."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.5.15"

RPM_NAME = "munge-devel-0.5.15-2.4.aarch64.rpm"
RPM_HASH = "954250f568a06182c87764ee081cf8a58bfbfd858c7159902a807d10e59134628d5e9915094c02ec06511a19e29e451714b2a932443caed7f345ef7baf08c720"

RPROVIDES:${PN} += "munge-devel \
pkgconfig-munge"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmunge2"

inherit rpm
