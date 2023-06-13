SUMMARY = "Basic plugins for nbdkit"
DESCRIPTION = "This package contains plugins for nbdkit which depend on a handful of \
C libraries: glibc, gnutls, libzstd.  Other plugins for nbdkit with \
more complex dependencies are packaged separately. \
 \
nbdkit-data-plugin          Serves small amounts of data from the command line. \
 \
nbdkit-eval-plugin          Writes a shell script plugin on the command line. \
 \
nbdkit-file-plugin          The normal file plugin for serving files. \
 \
nbdkit-floppy-plugin        Creates a virtual floppy disk from a directory. \
 \
nbdkit-full-plugin          A virtual disk that returns ENOSPC errors. \
 \
nbdkit-info-plugin          Serves client and server information. \
 \
nbdkit-memory-plugin        A virtual memory plugin. \
 \
nbdkit-null-plugin          A null (bitbucket) plugin. \
 \
nbdkit-ondemand-plugin      Creates filesystems on demand. \
 \
nbdkit-pattern-plugin       Fixed test pattern. \
 \
nbdkit-partitioning-plugin  Creates virtual disks from partitions. \
 \
nbdkit-random-plugin        Random content plugin for testing. \
 \
nbdkit-sh-plugin            Writes plugins as shell scripts or executables. \
 \
nbdkit-sparse-random-plugin Makes sparse random disks. \
 \
nbdkit-split-plugin         Concatenates one or more files. \
 \
nbdkit-zero-plugin          Zero-length plugin for testing."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-basic-plugins-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "9c00e800659f511169b88a657afc24332ef879863e57e6554e7dd9291ee6b02b07cee67e3d7460f9308b2272b46a446df93b4618a30bd1f7f4eea26ad2026fe1"

RPROVIDES:${PN} += "nbdkit-basic-plugins \
nbdkit-basic-plugins(aarch-64) \
nbdkit-data-plugin \
nbdkit-eval-plugin \
nbdkit-file-plugin \
nbdkit-floppy-plugin \
nbdkit-full-plugin \
nbdkit-info-plugin \
nbdkit-memory-plugin \
nbdkit-null-plugin \
nbdkit-ondemand-plugin \
nbdkit-partitioning-plugin \
nbdkit-pattern-plugin \
nbdkit-random-plugin \
nbdkit-sh-plugin \
nbdkit-sparse-random-plugin \
nbdkit-split-plugin \
nbdkit-streaming-plugin \
nbdkit-zero-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_0)(64bit) \
libzstd.so.1()(64bit) \
nbdkit-server"

inherit rpm
