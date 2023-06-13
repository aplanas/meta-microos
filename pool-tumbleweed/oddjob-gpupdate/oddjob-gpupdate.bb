SUMMARY = "An oddjob helper which applies group policy objects"
DESCRIPTION = "This package contains the oddjob helper which can be used by the \
pam_oddjob_gpupdate module to apply group policy objects at login-time."
LICENSE = "BSD-3-Clause"

PV = "0.2.0+git.5.ed70836"

RPM_NAME = "oddjob-gpupdate-0.2.0+git.5.ed70836-1.6.aarch64.rpm"
RPM_HASH = "306448dd640824dec1766c33939c6f93ab35d02a4e4d407e619b5c765061bc030bd7c094930a34c2c87ba68276ee1c7bd895c2c2c907b633663c06e0ff30e5fc"

RPROVIDES:${PN} += "config(oddjob-gpupdate) \
oddjob-gpupdate \
oddjob-gpupdate(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libpam.so.0()(64bit) \
oddjob"

inherit rpm
