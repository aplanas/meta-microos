SUMMARY = "KVM driver for docker-machine"
DESCRIPTION = "KVM driver for docker-machine which is using libvirt for setting up \
virtual machines with Docker."
LICENSE = "Apache-2.0"

PV = "1.30.1"

RPM_NAME = "docker-machine-driver-kvm2-1.30.1-1.3.aarch64.rpm"
RPM_HASH = "96b9be4e740cb218fd88ee7be427f7dd80986435e68ab05b2e96999df435919861b808980751e02eadd1b219416173a0a932c4e28c40021f1af3c21d5727c670"

RPROVIDES:${PN} += "docker-machine-driver-kvm2"

RDEPENDS:${PN} += "libc.so.6 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
