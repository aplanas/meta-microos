SUMMARY = "System group libvirt"
DESCRIPTION = "This package provides the system group 'libvirt'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-group-libvirt-20170617-24.14.noarch.rpm"
RPM_HASH = "3c0ed7abfaf33bf00b88f945028d71e076657315bc8c516e4724988f160c357e3d5aecb63352e9fdeb381b29f6ce616f14e17ac5b85546547280f84196e09531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(libvirt) \
system-group-libvirt"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
