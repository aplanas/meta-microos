SUMMARY = "Development files for the CHECK unit test framework"
DESCRIPTION = "Check is a unit test framework for C. It features a simple interface \
for defining unit tests, putting little in the way of the developer. \
Tests are run in a separate address space, so Check can catch both \
assertion failures and code errors that cause segmentation faults or \
other signals. The output from unit tests can be used within source \
code editors and IDEs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.2"

RPM_NAME = "check-devel-0.15.2-2.11.aarch64.rpm"
RPM_HASH = "26a011359fe4e1fa97ed36670fb09ce2d263a5b95eab919ea11c3c2127fec8dfc117c56896563ae83254d763c389a3cfc4197ca8693b52ef289de0b7a261dacb"

RPROVIDES:${PN} += "check-devel \
pkgconfig-check"

RDEPENDS:${PN} += "/usr/bin/gawk \
/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libcheck0"

inherit rpm
