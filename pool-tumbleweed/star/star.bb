SUMMARY = "tar implementation compliant to POSIX.1-2001"
DESCRIPTION = "Star is a tar-like archiver (tar standing for Tape ARchiver). \
 \
Features: \
* FIFO to keep the tape streaming \
* Remote tape support \
* Accurate sparse files \
* Pattern matcher to archive and extract a subset of files \
* User tailorable interface for comparing tar archives against file trees \
* Path names up to 1024 bytes may be archived \
* Stores and restores all 3 file times (even creation time). With POSIX.1-2001, \
  the times are in nanosecond granularity."
LICENSE = "CDDL-1.0"

PV = "1.6.1"

RPM_NAME = "star-1.6.1-47.3.aarch64.rpm"
RPM_HASH = "597111e3b1268a437c635c93cf7e16323da326b584ce9c1a0eda92521a2f4fa1d9d426742a073ebad91892dbb18482f0631f9d57da812982f397fd9f612f8972"

RPROVIDES:${PN} += "config(star) \
star \
star(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdeflt.so.1.0()(64bit) \
libdeflt.so.1.0(SCHILY_1.0)(64bit) \
libfind.so.4.0()(64bit) \
libfind.so.4.0(SCHILY_0.1)(64bit) \
libfind.so.4.0(SCHILY_0.9.1)(64bit) \
libfind.so.4.0(SCHILY_0.9.4)(64bit) \
librmt.so.1.0()(64bit) \
librmt.so.1.0(SCHILY_1.0)(64bit) \
librmt.so.1.0(SCHILY_1.1)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
libschily.so.2.0(SCHILY_1.1)(64bit) \
libschily.so.2.0(SCHILY_1.10)(64bit) \
libschily.so.2.0(SCHILY_1.2)(64bit) \
libschily.so.2.0(SCHILY_1.5)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm
