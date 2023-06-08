SUMMARY = "Development files for OpenIPMI"
DESCRIPTION = "These libraries are needed to get full access to the OpenIPMI \
functions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "OpenIPMI-devel-2.0.31-5.10.aarch64.rpm"
RPM_HASH = "274aa123838148739d49a9aa80083d6be66f63b203cc52b023b9b8005eb605427e2fa1bd46b8c7e8e733f1bd978478e22c5d1c17e02dc6d621a36d35af1d150e"

RPROVIDES:${PN} += "OpenIPMI-devel OpenIPMI-devel(aarch-64) pkgconfig(OpenIPMI) pkgconfig(OpenIPMIcmdlang) pkgconfig(OpenIPMIglib) pkgconfig(OpenIPMIposix) pkgconfig(OpenIPMIpthread) pkgconfig(OpenIPMIui) pkgconfig(OpenIPMIutils)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libOpenIPMI0 libOpenIPMIui1 pkgconfig(OpenIPMI) pkgconfig(OpenIPMIutils) pkgconfig(ncurses)"

inherit rpm
