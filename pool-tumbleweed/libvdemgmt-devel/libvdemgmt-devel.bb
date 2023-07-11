SUMMARY = "VDE management files"
DESCRIPTION = "This package contains VDE management files"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdemgmt-devel-2.3.2+svn587-3.24.aarch64.rpm"
RPM_HASH = "e2b1fea048ce8ba5f603b747830f4b61f8cdd6a854b4a632037e39b732ec5cb2a6753d1c80c8ec7f01097d215fbdf65f6b234a18ec2076f9073655f8b411fc8d"

RPROVIDES:${PN} += "libvdemgmt-devel \
libvdemgmt0-devel \
pkgconfig-vdemgmt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdemgmt0 \
vde2"

inherit rpm
