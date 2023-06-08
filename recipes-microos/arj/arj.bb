SUMMARY = "Archiver for .arj files"
DESCRIPTION = "An implementation of an .arj archiving program. It preserves compatibility and \
retains the feature set of original ARJ archiver as provided by ARJ Software, \
Inc. \
This open implementation is produced by the namesake, but otherwise \
unaffiliated, ARJ Software Russia."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.22"

RPM_NAME = "arj-3.10.22-5.1.aarch64.rpm"
RPM_HASH = "f37729eeb82b41ae4de73b546cba2f674c125b6042304e9f3375f9bce36969cdcfd01e10c88932ef91bd88e4a3d3cd28c65335b6d7b8ec5143b02c086e212f1a"

RPROVIDES:${PN} += "arj arj(aarch-64) config(arj)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
