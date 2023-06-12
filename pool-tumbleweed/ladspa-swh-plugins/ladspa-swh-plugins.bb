SUMMARY = "LADSPA SWH plugins"
DESCRIPTION = "This package provides a collection of LADSPA (Linux Audio Developer's \
Simple Plug-in API) plugins written by Steve Harris."
LICENSE = "GPL-2.0+"

PV = "0.4.17"

RPM_NAME = "ladspa-swh-plugins-0.4.17-1.25.aarch64.rpm"
RPM_HASH = "b3db61851abe0d742e46243f3d473330c6a57884fbbfe97f0e23cc8e9c782b93859c4f86fa4a7dc8436db5fe30563e55a74505bd239091148196297a1be19c54"

RPROVIDES:${PN} += "ladspa-swh-plugins \
ladspa-swh-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3f.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
