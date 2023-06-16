SUMMARY = "Revision Control System"
DESCRIPTION = "RCS, the Revision Control System, manages multiple revisions of files. \
RCS can store, retrieve, log, identify, and merge revisions. It is \
useful for files that are frequently revised, for example: programs, \
documentation, graphics, and papers."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.1"

RPM_NAME = "rcs-5.10.1-2.7.aarch64.rpm"
RPM_HASH = "453fbdd6d5ecef12969bbb98f697f4aa0ebde6ae801eab7798af1ec597d9ee61919b850b24fa94710798abce1bb65797903d575b724fd18340246c3c55bf58c9"

RPROVIDES:${PN} += "rcs"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
