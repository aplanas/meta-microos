SUMMARY = "Testsuite for vagrant-sshfs"
DESCRIPTION = "This package contains the testsuite for the SSHFS provider for Vagrant. You most \
likely do not want to install this package, unless you want to test \
vagrant-sshfs."
LICENSE = "GPL-2.0-only"

PV = "1.3.7"

RPM_NAME = "vagrant-sshfs-testsuite-1.3.7-3.4.aarch64.rpm"
RPM_HASH = "54f5b96ebf0bb6eed9fed39f503f01ca5e6b3ebd05ec600bb2f1db3d79a3a4c49504707b0a93e691d3d272758cef005e1ba683004f247542c462d57b8899ba8e"

RPROVIDES:${PN} += "vagrant-sshfs-testsuite \
vagrant-sshfs-testsuite(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
vagrant-libvirt \
vagrant-sshfs"

inherit rpm
