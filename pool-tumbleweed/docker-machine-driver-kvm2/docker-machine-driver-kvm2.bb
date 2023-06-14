SUMMARY = "KVM driver for docker-machine"
DESCRIPTION = "KVM driver for docker-machine which is using libvirt for setting up \
virtual machines with Docker."
LICENSE = "Apache-2.0"

PV = "1.30.1"

RPM_NAME = "docker-machine-driver-kvm2-1.30.1-1.2.aarch64.rpm"
RPM_HASH = "396ecf470c128aa3b9a43b7d2f875a631076a4c3306ad53820c6e1e92b4a9d120428c2778e51ff50f93369d23179aa99b31c3cce634d3c5751e2c5795b32ceb8"

RPROVIDES:${PN} += "docker-machine-driver-kvm2"

RDEPENDS:${PN} += "libc.so.6 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
