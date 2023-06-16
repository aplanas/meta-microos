SUMMARY = "Development files for the CHECK unit test framework"
DESCRIPTION = "Check is a unit test framework for C. It features a simple interface \
for defining unit tests, putting little in the way of the developer. \
Tests are run in a separate address space, so Check can catch both \
assertion failures and code errors that cause segmentation faults or \
other signals. The output from unit tests can be used within source \
code editors and IDEs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.2"

RPM_NAME = "check-devel-0.15.2-2.10.aarch64.rpm"
RPM_HASH = "f690a40c5baf562bc99c20e01a967e6a03f839c21821a8356f2a00da85e63b00e4044b339c233df86c96b49b4441781b14331367561b5b5984e60dc9a8499f53"

RPROVIDES:${PN} += "check-devel \
pkgconfig-check"

RDEPENDS:${PN} += "/usr/bin/gawk \
/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libcheck0"

inherit rpm
