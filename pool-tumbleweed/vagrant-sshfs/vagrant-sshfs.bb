SUMMARY = "SSHFS synced folder implementation for Vagrant"
DESCRIPTION = "This Vagrant plugin adds synced folder support for mounting folders from the \
Vagrant host into the Vagrant guest via SSHFS. In the default mode it does this \
by executing the SSHFS client software within the guest, which creates an SSH \
connection from the Vagrant guest back to the Vagrant host."
LICENSE = "GPL-2.0-only"

PV = "1.3.7"

RPM_NAME = "vagrant-sshfs-1.3.7-3.5.aarch64.rpm"
RPM_HASH = "3e1c4e84e4d391588b3f61abf457a51f54034ebee9fec84ebda5d96adf337ceea4915cffefaaf300cd948893e9c154d18afb7a66ab4fbb0899c0855f8be22de0"

RPROVIDES:${PN} += "vagrant-sshfs"

RDEPENDS:${PN} += "/usr/bin/bash \
fuse \
sshfs \
vagrant"

inherit rpm
