SUMMARY = "Library for Handling Page Faults in User Mode"
DESCRIPTION = "This is a library for handling page faults in user mode. A page fault occurs \
when a program tries to access to a region of memory that is currently not \
available."
LICENSE = "GPL-2.0-or-later"

PV = "2.14"

RPM_NAME = "libsigsegv-devel-2.14-2.9.aarch64.rpm"
RPM_HASH = "22c1297773a051b309e204d6b3db21c09f997e46518120c7fca15eced1dd54fbda19542a501a7ce5a336e58b96ee6dc52c1d9c3268bc1beb0807c82f9f32c847"

RPROVIDES:${PN} += "libsigsegv-devel"

RDEPENDS:${PN} += "libsigsegv2"

inherit rpm
