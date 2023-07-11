SUMMARY = "Tool to Define a Virtual Machine and Install Its Operating System"
DESCRIPTION = "vm-install can define a Xen virtual machine, and cause an operating \
system to begin installing within that virtual machine. \
 \
vm-install can be used in a variety of ways: \
 \
* It can be used interactively or non-interactively. \
 \
* It can automatically pick reasonable VM defaults for a given type \
   of operating system. \
 \
* It can perform completely non-interactive installs, driven via XML \
   files and/or command line parameters. \
 \
* The  supporting  Python  modules  can  be 'import'-ed into other \
Python programs, to create VMs programmatically. \
 \
 \
 \
Authors: \
-------- \
    Charles Coffing <ccoffing@novell.com>"
LICENSE = "GPL-2.0-only"

PV = "0.10.11"

RPM_NAME = "vm-install-0.10.11-1.11.aarch64.rpm"
RPM_HASH = "dfebbb6bed8d924b90e797506941cce625539fc4263b7bae0e2cc434a9f2b838ccec041890ac4be218b6f0abe825521cf4a9c7781bcea64b2fe63bd62cf9a7e4"

RPROVIDES:${PN} += "config-vm-install \
vm-install"

RDEPENDS:${PN} += "/usr/bin/python3 \
kdump \
python-abi \
python3-dbus-python \
python3-libvirt-python \
python3-libxml2-python \
python3-netifaces \
python3-pycurl \
qemu-tools \
tftp-client \
usbutils"

inherit rpm
