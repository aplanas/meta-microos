SUMMARY = "OpenCL ICD Bindings"
DESCRIPTION = "OpenCL is a royalty-free standard for cross-platform, parallel programming \
of modern processors found in personal computers, servers and \
handheld/embedded devices. \
 \
This package provides an Installable Client Driver Bindings (ICD Bindings). \
The provided libOpenCL library is able to load any free or non-free installed \
ICD (driver backend)."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "libOpenCL1-2.3.1-2.1.aarch64.rpm"
RPM_HASH = "2e290d008259d319f83f66914f76a1a0549820fb9d70fc47739cd478e29f5d8fddce9c469997336bffdbb105226bfa263d854b834e6b6da11f5d353f8a5a781d"

RPROVIDES:${PN} += "libOpenCL.so.1 \
libOpenCL1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
