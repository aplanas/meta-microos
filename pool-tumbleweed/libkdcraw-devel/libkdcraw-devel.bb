SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files.  The library documentation is available on header \
files. \
 \
This library is used by kipi-plugins, digiKam and others kipi host \
programs."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkdcraw-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "17daed9fa72e5f2ba1d04803801358cdbe34cdb01762a107f6df3d1334f0cabff7acb0fcdea243dbf16a923528631b64129e51a003c1f37ba6aa67c3fe5360a2"

RPROVIDES:${PN} += "cmake-KF5KDcraw \
libkdcraw-devel \
libkdcraw-kf5-devel"

RDEPENDS:${PN} += "libKF5KDcraw5"

inherit rpm
