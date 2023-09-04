SUMMARY = "Machine emulator and virtualizer for x86 architectures"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This package provides i386 and x86_64 emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-x86-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "d9af5544bdb7a65c02e2f4a24bd76128e221a1c1ef39918fb1a49a1854c5f6dc9f2d07b4715aad6e31476ecda34f97b944cc6958ef14a5386efb91d7fa2a2154"

RPROVIDES:${PN} += "qemu-x86"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaio.so.1 \
libbpf.so.1 \
libc.so.6 \
libcapstone.so.4 \
libfdt.so.1 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libibverbs.so.1 \
libjpeg.so.8 \
liblzo2.so.2 \
libm.so.6 \
libnuma.so.1 \
libpam.so.0 \
libpixman-1.so.0 \
libpng16.so.16 \
librdmacm.so.1 \
libsasl2.so.3 \
libseccomp.so.2 \
libslirp.so.0 \
libsnappy.so.1 \
libudev.so.1 \
liburing.so.2 \
libvdeplug.so.3 \
libz.so.1 \
libzstd.so.1 \
qemu \
qemu-accel-tcg-x86 \
qemu-ipxe \
qemu-seabios \
qemu-vgabios"

inherit rpm
