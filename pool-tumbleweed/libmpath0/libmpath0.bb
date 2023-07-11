SUMMARY = "Libraries for multipath-tools"
DESCRIPTION = "libmpathpersist provides a C API for handling of SCSI persistent \
reservations for device-mapper multipath devices. libmpathcmd \
provides a C API for sending commands to a running multipathd \
instance."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & LGPL-2.0-or-later"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "libmpath0-0.9.5+68+suse.d1b6a1c-1.2.aarch64.rpm"
RPM_HASH = "29f1d0f4e4709107e145472d8470f4c6c91fd61457054cec65e06331bcc13ff6ce190d109b5e199ed03ffedae603e2b0db3f11e74662f8cc5151abc1e89be472"

RPROVIDES:${PN} += "libcheckcciss-tur.so \
libcheckdirectio.so \
libcheckemc-clariion.so \
libcheckhp-sw.so \
libcheckrdac.so \
libcheckreadsector0.so \
libchecktur.so \
libforeign-nvme.so \
libmpath0 \
libmpathcmd.so.0 \
libmpathpersist.so.0 \
libmpathutil.so.0 \
libmpathvalid.so.0 \
libmultipath.so.0 \
libprioalua.so \
libprioconst.so \
libpriodatacore.so \
libprioemc.so \
libpriohds.so \
libpriohp-sw.so \
libprioiet.so \
libprioontap.so \
libpriopath-latency.so \
libpriorandom.so \
libpriordac.so \
libpriosysfs.so \
libprioweightedpath.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libm.so.6 \
libmount.so.1 \
libsystemd.so.0 \
libudev.so.1 \
liburcu.so.8"

inherit rpm
