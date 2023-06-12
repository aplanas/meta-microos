SUMMARY = "Tools to Manage Multipathed Devices with the device-mapper"
DESCRIPTION = "This package provides the multipath tool and the multipathd daemon \
to manage dm-multipath devices. multipath can detect and set up \
multipath maps. multipathd sets up multipath maps automatically, \
monitors path devices for failure, removal, or addition, and applies \
the necessary changes to the multipath maps to ensure continuous \
availability of the map devices."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "multipath-tools-0.9.5+68+suse.d1b6a1c-1.1.aarch64.rpm"
RPM_HASH = "a964083b6f524ac4fa61170d8b02e492a72b227efc80e790c304cae2909806f577b67d3bd282f6fdaf45b265c51a28c0bbacbae910f8b383d3050e680d18510a"

RPROVIDES:${PN} += "multipath-tools \
multipath-tools(aarch-64)"
RDEPENDS:${PN} += "(kmod(dm_multipath.ko) if kernel) \
(kmod(scsi_dh_alua.ko) if kernel) \
(kmod(scsi_dh_emc.ko) if kernel) \
(kmod(scsi_dh_rdac.ko) if kernel) \
/bin/sh \
coreutils \
device-mapper \
grep \
kpartx \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
libdevmapper.so.1.03(DM_1_02_98)(64bit) \
libmpathcmd.so.0()(64bit) \
libmpathcmd.so.0(LIBMPATHCMD_1.0.0)(64bit) \
libmpathpersist.so.0()(64bit) \
libmpathpersist.so.0(LIBMPATHPERSIST_2.1.0)(64bit) \
libmpathpersist.so.0(__LIBMPATHPERSIST_INT_1.0.0)(64bit) \
libmpathutil.so.0()(64bit) \
libmpathutil.so.0(LIBMPATHUTIL_1.1)(64bit) \
libmpathutil.so.0(LIBMULTIPATH_16.0.0)(64bit) \
libmultipath.so.0()(64bit) \
libmultipath.so.0(LIBMPATHCOMMON_1.0.0)(64bit) \
libmultipath.so.0(LIBMULTIPATH_18.0.0)(64bit) \
libmultipath.so.0(LIBMULTIPATH_18.1.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
liburcu.so.8()(64bit) \
sg3_utils \
suse-module-tools \
systemd"

inherit rpm
