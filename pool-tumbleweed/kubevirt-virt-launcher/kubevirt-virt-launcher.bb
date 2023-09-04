SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-launcher-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "2a8fbbc47d46fdfc1a7112f92d4848b4ecf3191fbf49737c1e290958c79b4296215b0b7e45c78ab9193cfc6d0ed69d80136b9bcda3cfb61bccc04651f5044609"

RPROVIDES:${PN} += "kubevirt-virt-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
