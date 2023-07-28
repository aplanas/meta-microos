SUMMARY = "KVM driver for docker-machine"
DESCRIPTION = "KVM driver for docker-machine which is using libvirt for setting up \
virtual machines with Docker."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "docker-machine-driver-kvm2-1.31.0-1.1.aarch64.rpm"
RPM_HASH = "d310656f24ccdaafb718ea62463e277096a0c90b80a606a1657b790f2acf0f96df2b4cfdd275adb333ef4dd6414f82c0e9f96a1df8c57289e61ed48ff457273b"

RPROVIDES:${PN} += "docker-machine-driver-kvm2"

RDEPENDS:${PN} += "libc.so.6 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
