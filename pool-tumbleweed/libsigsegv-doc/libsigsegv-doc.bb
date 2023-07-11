SUMMARY = "Library for Handling Page Faults in User Mode"
DESCRIPTION = "This is a library for handling page faults in user mode. A page fault occurs \
when a program tries to access to a region of memory that is currently not \
available."
LICENSE = "GPL-2.0-or-later"

PV = "2.14"

RPM_NAME = "libsigsegv-doc-2.14-2.10.aarch64.rpm"
RPM_HASH = "0c09e1480272c4d0e31ba5131464e4b2ede7c467bb1ba749ee68cb9da7329c90ec7679ddbaebeaaf86a9662bd7e10c2faa22eedefc9ee6f492ca5dbb76f7c24b"

RPROVIDES:${PN} += "libsigsegv-doc"

RDEPENDS:${PN} += ""

inherit rpm
