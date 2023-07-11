SUMMARY = "The iSCSI User-level Library Development Library and Include files"
DESCRIPTION = "This development package contains the open-iscsi user-level library \
include files and documentation. These are used to compile against \
the libopeniscsiusr library."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.9"

RPM_NAME = "open-iscsi-devel-2.1.9-101.1.aarch64.rpm"
RPM_HASH = "14d298f8fdd57476306f63b46002cc2552ab85483f48d68948bb38bda8d55d6948b877e3f02087df24078682f3f22823070d53f6e02d6ce2075091979041e953"

RPROVIDES:${PN} += "open-iscsi-devel \
pkgconfig-libopeniscsiusr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopeniscsiusr0 \
open-iscsi"

inherit rpm
