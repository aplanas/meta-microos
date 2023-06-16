SUMMARY = "System user and group qemu"
DESCRIPTION = "This package provides the system account and group 'qemu'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-qemu-20170617-24.14.noarch.rpm"
RPM_HASH = "a3e2c0dc833edbc272a40f8c32a5ae962e4348eb289e9e08381bdf3f709df79493854725806cf82bce213711580eebdf3d5ccd9fe4d7efc22d887427116c70fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-qemu \
system-user-qemu \
user-qemu"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kvm \
sysuser-shadow"

inherit rpm
