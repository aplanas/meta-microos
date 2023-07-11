SUMMARY = "Files needed for gkrellm2 development"
DESCRIPTION = "Files needed to build plugins for gkrellm2"
LICENSE = "GPL-3.0-or-later"

PV = "2.3.11"

RPM_NAME = "gkrellm-devel-2.3.11-2.11.aarch64.rpm"
RPM_HASH = "6c9b2b1c15374b14894ba2ef531c6a7cadf9cebf786e5a75c0798913ca8730d9744148436e813e1127f34a0cf35010086ca62a02e8044ac2df41fdece8aeb36d"

RPROVIDES:${PN} += "gkrellm-devel \
pkgconfig-gkrellm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gkrellm \
pkgconfig-gtk+-2.0"

inherit rpm
