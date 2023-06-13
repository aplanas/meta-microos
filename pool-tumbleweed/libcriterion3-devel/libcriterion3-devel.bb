SUMMARY = "Devel files for Criterion"
DESCRIPTION = "Contains all needed devel files for Criterion."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libcriterion3-devel-2.4.1-1.4.aarch64.rpm"
RPM_HASH = "82b1edf63a82d67d4c5f56011818af93a5bbb4a11abfb95cef0e3c2835cab6dc4a1bdcf12eeef184760e1d105cbb5ed9ceb26f11b0a31365be538201f10f96dd"

RPROVIDES:${PN} += "libcriterion3-devel \
libcriterion3-devel(aarch-64) \
pkgconfig(criterion)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcriterion3 \
pkgconfig(boxfort) \
pkgconfig(libffi) \
pkgconfig(libgit2) \
pkgconfig(nanomsg)"

inherit rpm
