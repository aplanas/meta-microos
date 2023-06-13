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

RPM_NAME = "vm-install-0.10.11-1.10.aarch64.rpm"
RPM_HASH = "09900f1d5fcf7b02af9f76238e1f5d5cef2389ef5cf957c0712769e8f0d0db929a87dfb2ca70965aa37b9fe5236e8b9318527d7517f5b0d2712a10800d790f26"

RPROVIDES:${PN} += "config(vm-install) \
vm-install \
vm-install(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
kdump \
python(abi) \
python3-dbus-python \
python3-libvirt-python \
python3-libxml2-python \
python3-netifaces \
python3-pycurl \
qemu-tools \
tftp(client) \
usbutils"

inherit rpm
