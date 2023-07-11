SUMMARY = "Library for Handling Page Faults in User Mode"
DESCRIPTION = "This is a library for handling page faults in user mode. A page fault occurs \
when a program tries to access to a region of memory that is currently not \
available."
LICENSE = "GPL-2.0-or-later"

PV = "2.14"

RPM_NAME = "libsigsegv-devel-2.14-2.10.aarch64.rpm"
RPM_HASH = "e9b47886daaff0b03cc09d47c45045c1f692c3707f38b600bdba0f3094b799dd90acfe352085bf99ead1527214f8522b1e9aba136f4b896153a1a788a1565fb2"

RPROVIDES:${PN} += "libsigsegv-devel"

RDEPENDS:${PN} += "libsigsegv2"

inherit rpm
