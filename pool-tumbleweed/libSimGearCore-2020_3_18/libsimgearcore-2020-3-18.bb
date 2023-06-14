SUMMARY = "Simulator Construction Gear"
DESCRIPTION = "SimGear is a set of open-source libraries designed to be used as building \
blocks for quickly assembling 3D simulations, games, and visualization \
applications. \
 \
SimGear is developed as part of the FlightGear project and used by the \
FlightGear flight simulator and many of its related utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & MIT"

PV = "2020.3.18"

RPM_NAME = "libSimGearCore-2020_3_18-2020.3.18-1.1.aarch64.rpm"
RPM_HASH = "90ed2b0209477fd6f2fc4ba0beae78b4b4535e49a48775184df94a0face80b8c18cc2ec08826cbff3acca2285844ba8e7a45cf66def09418cfe5b406618527cd"

RPROVIDES:${PN} += "libSimGearCore-2020-3-18 \
libSimGearCore.so.2020.3.18 \
libSimGearScene.so.2020.3.18"

RDEPENDS:${PN} += "/sbin/ldconfig \
OpenSceneGraph-plugins \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libOpenThreads.so.21 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
liblzma.so.5 \
libm.so.6 \
libopenal.so.1 \
libosg.so.161 \
libosgDB.so.161 \
libosgGA.so.161 \
libosgParticle.so.161 \
libosgSim.so.161 \
libosgText.so.161 \
libosgUtil.so.161 \
libstdc++.so.6 \
libudns.so.0 \
libz.so.1"

inherit rpm
