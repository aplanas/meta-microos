SUMMARY = "Archiver for .arj files"
DESCRIPTION = "An implementation of an .arj archiving program. It preserves compatibility and \
retains the feature set of original ARJ archiver as provided by ARJ Software, \
Inc. \
This open implementation is produced by the namesake, but otherwise \
unaffiliated, ARJ Software Russia."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.22"

RPM_NAME = "arj-3.10.22-5.2.aarch64.rpm"
RPM_HASH = "e35e9e768c3969ef56cb462fbffaa8ec43977764ce0b55af40f981919b326969dff0b9a1dba0fe12d811e5d0c8020588a3014265e4ead1a6a515604284f4bd63"

RPROVIDES:${PN} += "arj \
config-arj"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
