SUMMARY = "The NetBSD make(1) tool"
DESCRIPTION = "bmake, the NetBSD make(1) tool, is a program designed to simplify the \
maintenance of other programs.  The input of bmake is a list of specifications \
indicating the files upon which the targets (programs and other files) depend. \
bmake then detects which targets are out of date based on their dependencies \
and triggers the necessary commands to bring them up to date when that happens. \
 \
bmake is similar to GNU make, even though the syntax for the advanced features \
supported in Makefiles is very different."
LICENSE = "BSD-2-Clause & BSD-3-Clause & BSD-4-Clause"

PV = "20200606"

RPM_NAME = "bmake-20200606-2.10.aarch64.rpm"
RPM_HASH = "3150ce893e5387b5e1109ca92a775aac15fd6c5f73234de5ab0a075c7d2d4ac6b113e25b5a4667bd23bd49eb97c601dd3c632ce55a94b06704d088530d10f329"

RPROVIDES:${PN} += "bmake"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
