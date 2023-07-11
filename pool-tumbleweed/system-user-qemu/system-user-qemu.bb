SUMMARY = "System user and group qemu"
DESCRIPTION = "This package provides the system account and group 'qemu'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-qemu-20170617-24.16.noarch.rpm"
RPM_HASH = "5cb8d4c2a60541d218f4f0501599faabdcb6aeda3cb58dd52a7fe99575a3d500debfbcfba95918486a70c347a250a9c5aa02ba992dc5efa60ebd2bc6e3ad6c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-qemu \
system-user-qemu \
user-qemu"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kvm \
sysuser-shadow"

inherit rpm
