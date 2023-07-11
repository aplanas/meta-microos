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

RPM_NAME = "star-1.6.1-47.4.aarch64.rpm"
RPM_HASH = "cc62a8b7b379a1260f450f87bdf2a161840a37d2274bd9d1e1095d25dd87a508dfcc83098605aa8fbffce627318d27d7151e094db831f22b846100d90487fc39"

RPROVIDES:${PN} += "config-star \
star"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libdeflt.so.1.0 \
libfind.so.4.0 \
librmt.so.1.0 \
libschily.so.2.0 \
libselinux.so.1"

inherit rpm
