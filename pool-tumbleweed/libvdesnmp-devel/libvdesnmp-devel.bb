SUMMARY = "VDE SNMP header files"
DESCRIPTION = "This package contains VDE SNMP header files."
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdesnmp-devel-2.3.2+svn587-3.24.aarch64.rpm"
RPM_HASH = "d30cdcc7a47aa64c8185062a15529ef5c673492e99adabf7415362a935beca1eec4ac16c2198d0cbaf5004e4c90cd016d8e7a0c6d440407641286f46acb05ca9"

RPROVIDES:${PN} += "libvdesnmp-devel \
libvdesnmp0-devel \
pkgconfig-vdesnmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdesnmp0 \
vde2"

inherit rpm
