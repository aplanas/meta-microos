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

RPM_NAME = "bmake-20200606-2.9.aarch64.rpm"
RPM_HASH = "d153a06ea5ba94f7fc03c5d38513a308de3b730e620131fef66e659363f752a3d11fe700a699f26227e708affae3caa2fdccfccb22456ae4c4a9eb4bca4b09de"

RPROVIDES:${PN} += "bmake bmake(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
