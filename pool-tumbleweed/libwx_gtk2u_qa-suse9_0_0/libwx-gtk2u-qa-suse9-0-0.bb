SUMMARY = "wxWidgets quality assurance class library"
DESCRIPTION = "This is the library containing extra classes for quality \
assurance, containing the wxDebugReport class. wxDebugReport is \
used to generate a debug report, containing information about the \
program current state."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_qa-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "4aeda3aa0ce11f447e3f7c6b04ae582ffc0b46b431f2d3e68cbe081cda330e6e5eb0794413554e1338e2d1c0b192125c38aa2c8ef493cae4c0d5d1b89ed6a36f"

RPROVIDES:${PN} += "libwx-gtk2u-qa-suse.so.9.0.0 \
libwx-gtk2u-qa-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
