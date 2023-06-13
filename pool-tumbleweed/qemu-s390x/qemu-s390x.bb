SUMMARY = "Machine emulator and virtualizer for S/390 architectures"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This package provides s390x emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-s390x-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "b1720655e1018533096de048d78cda1f47dfdabe79ed799478c767273df778845aefe31ebda2d3a74f8497b5a55272b444f660d4826e403a75776c9a2699a9e9"

RPROVIDES:${PN} += "qemu-s390 \
qemu-s390x \
qemu-s390x(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libaio.so.1()(64bit) \
libbpf.so.1()(64bit) \
libc.so.6()(64bit) \
libcapstone.so.4()(64bit) \
libfdt.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcrypt.so.20()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libibverbs.so.1()(64bit) \
libjpeg.so.8()(64bit) \
liblzo2.so.2()(64bit) \
libm.so.6()(64bit) \
libnuma.so.1()(64bit) \
libpam.so.0()(64bit) \
libpixman-1.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
librdmacm.so.1()(64bit) \
libsasl2.so.3()(64bit) \
libseccomp.so.2()(64bit) \
libslirp.so.0()(64bit) \
libsnappy.so.1()(64bit) \
liburing.so.2()(64bit) \
libvdeplug.so.3()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
qemu"

inherit rpm
