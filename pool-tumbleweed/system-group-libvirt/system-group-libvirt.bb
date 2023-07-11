SUMMARY = "System group libvirt"
DESCRIPTION = "This package provides the system group 'libvirt'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-group-libvirt-20170617-24.16.noarch.rpm"
RPM_HASH = "a2929d4df8a36d94159d432a395234df2172df030ea12cda8be1489ead5ad15f6b3e857be79b468be5244751dfe5ecf14c27f48d5fb9560ec595f1ac16c187bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-libvirt \
system-group-libvirt"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
