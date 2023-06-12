SUMMARY = "Daemon to manage RDMA Node Description"
DESCRIPTION = "rdma-ndd is a system daemon which watches for rdma device changes and/or \
hostname changes and updates the Node Description of the rdma devices based \
on those changes."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "rdma-ndd-45.0-1.1.aarch64.rpm"
RPM_HASH = "6ed67dd6bd236e5a9693ba73a55b26f36ba0765578f481563fe23529ea69e9cdac01de4e301a7ab95d0e2626b8c4f158a157d8cca4c8450ac19ed80373722bc6"

RPROVIDES:${PN} += "rdma-ndd \
rdma-ndd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
rdma-core \
systemd"

inherit rpm
