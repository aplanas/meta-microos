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
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit) \
ruby(abi)"

inherit rpm
