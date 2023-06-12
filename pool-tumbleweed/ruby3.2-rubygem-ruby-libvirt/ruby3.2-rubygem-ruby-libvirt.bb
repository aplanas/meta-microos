SUMMARY = "Ruby bindings for LIBVIRT"
DESCRIPTION = "Ruby bindings for libvirt."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.0"

RPM_NAME = "ruby3.2-rubygem-ruby-libvirt-0.8.0-1.6.aarch64.rpm"
RPM_HASH = "e6a1b08a65a5c19ec225d483a20798c5b1796caa7a3fbae59db68368ad738ce93f86a1f0f00f97177dcdf810209cc5637b517e18f86915b80418131403dd8731"

RPROVIDES:${PN} += "ruby3.2-rubygem-ruby-libvirt \
ruby3.2-rubygem-ruby-libvirt(aarch-64) \
rubygem(ruby-libvirt) \
rubygem(ruby:3.2.0:ruby-libvirt) \
rubygem(ruby:3.2.0:ruby-libvirt:0) \
rubygem(ruby:3.2.0:ruby-libvirt:0.8) \
rubygem(ruby:3.2.0:ruby-libvirt:0.8.0)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
libvirt-lxc.so.0()(64bit) \
libvirt-lxc.so.0(LIBVIRT_LXC_1.0.2)(64bit) \
libvirt-lxc.so.0(LIBVIRT_LXC_1.0.4)(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_0.10.0)(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_0.8.3)(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_0.9.4)(64bit) \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_0.1.1)(64bit) \
libvirt.so.0(LIBVIRT_0.1.4)(64bit) \
libvirt.so.0(LIBVIRT_0.1.5)(64bit) \
libvirt.so.0(LIBVIRT_0.1.9)(64bit) \
libvirt.so.0(LIBVIRT_0.10.0)(64bit) \
libvirt.so.0(LIBVIRT_0.10.2)(64bit) \
libvirt.so.0(LIBVIRT_0.2.0)(64bit) \
libvirt.so.0(LIBVIRT_0.2.1)(64bit) \
libvirt.so.0(LIBVIRT_0.2.3)(64bit) \
libvirt.so.0(LIBVIRT_0.3.0)(64bit) \
libvirt.so.0(LIBVIRT_0.3.2)(64bit) \
libvirt.so.0(LIBVIRT_0.3.3)(64bit) \
libvirt.so.0(LIBVIRT_0.4.0)(64bit) \
libvirt.so.0(LIBVIRT_0.4.1)(64bit) \
libvirt.so.0(LIBVIRT_0.4.2)(64bit) \
libvirt.so.0(LIBVIRT_0.4.5)(64bit) \
libvirt.so.0(LIBVIRT_0.5.0)(64bit) \
libvirt.so.0(LIBVIRT_0.6.1)(64bit) \
libvirt.so.0(LIBVIRT_0.6.3)(64bit) \
libvirt.so.0(LIBVIRT_0.6.4)(64bit) \
libvirt.so.0(LIBVIRT_0.7.0)(64bit) \
libvirt.so.0(LIBVIRT_0.7.1)(64bit) \
libvirt.so.0(LIBVIRT_0.7.2)(64bit) \
libvirt.so.0(LIBVIRT_0.7.3)(64bit) \
libvirt.so.0(LIBVIRT_0.7.5)(64bit) \
libvirt.so.0(LIBVIRT_0.7.7)(64bit) \
libvirt.so.0(LIBVIRT_0.8.0)(64bit) \
libvirt.so.0(LIBVIRT_0.8.1)(64bit) \
libvirt.so.0(LIBVIRT_0.8.2)(64bit) \
libvirt.so.0(LIBVIRT_0.8.5)(64bit) \
libvirt.so.0(LIBVIRT_0.8.6)(64bit) \
libvirt.so.0(LIBVIRT_0.8.8)(64bit) \
libvirt.so.0(LIBVIRT_0.9.0)(64bit) \
libvirt.so.0(LIBVIRT_0.9.10)(64bit) \
libvirt.so.0(LIBVIRT_0.9.11)(64bit) \
libvirt.so.0(LIBVIRT_0.9.13)(64bit) \
libvirt.so.0(LIBVIRT_0.9.2)(64bit) \
libvirt.so.0(LIBVIRT_0.9.3)(64bit) \
libvirt.so.0(LIBVIRT_0.9.4)(64bit) \
libvirt.so.0(LIBVIRT_0.9.5)(64bit) \
libvirt.so.0(LIBVIRT_0.9.7)(64bit) \
libvirt.so.0(LIBVIRT_0.9.8)(64bit) \
libvirt.so.0(LIBVIRT_0.9.9)(64bit) \
libvirt.so.0(LIBVIRT_1.0.0)(64bit) \
libvirt.so.0(LIBVIRT_1.0.1)(64bit) \
libvirt.so.0(LIBVIRT_1.0.2)(64bit) \
libvirt.so.0(LIBVIRT_1.0.3)(64bit) \
libvirt.so.0(LIBVIRT_1.0.5)(64bit) \
libvirt.so.0(LIBVIRT_1.1.0)(64bit) \
libvirt.so.0(LIBVIRT_1.1.1)(64bit) \
libvirt.so.0(LIBVIRT_1.1.3)(64bit) \
libvirt.so.0(LIBVIRT_1.2.11)(64bit) \
libvirt.so.0(LIBVIRT_1.2.12)(64bit) \
libvirt.so.0(LIBVIRT_1.2.16)(64bit) \
libvirt.so.0(LIBVIRT_1.2.19)(64bit) \
libvirt.so.0(LIBVIRT_1.2.3)(64bit) \
libvirt.so.0(LIBVIRT_1.2.5)(64bit) \
libvirt.so.0(LIBVIRT_1.2.6)(64bit) \
libvirt.so.0(LIBVIRT_1.2.7)(64bit) \
libvirt.so.0(LIBVIRT_1.2.9)(64bit) \
ruby(abi)"

inherit rpm