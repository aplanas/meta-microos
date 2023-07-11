SUMMARY = "Linux Broadcom NetXtremem II iscsi server"
DESCRIPTION = "This tool is to be used in conjunction with the Broadcom NetXtreme II Linux \
driver (Kernel module name: 'bnx2' and 'bnx2x'), Broadcom CNIC driver, \
and the Broadcom iSCSI driver (Kernel module name: 'bnx2i'). \
This user-space tool is used in conjunction with the following \
Broadcom Network Controllers: \
 \
* bnx2:  BCM5706, BCM5708, BCM5709 devices \
* bnx2x: BCM57710, BCM57711, BCM57711E, BCM57712, BCM57712E, \
         BCM57800, BCM57810, BCM57840 devices \
 \
This utility will provide the ARP and DHCP functionality for the iSCSI offload. \
The communication to the driver is done via user-space I/O (Kernel module name \
'uio')."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.8.7"

RPM_NAME = "iscsiuio-0.7.8.7-101.1.aarch64.rpm"
RPM_HASH = "8d37a82bcbea591e5d60e220a0ed23242d8a651bb3a4f51149fa15bc52903234aa1dc64c5f4e220628d10e19d5ea1e381e7b07714ec773bd51087990d712313d"

RPROVIDES:${PN} += "iscsiuio"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
logrotate"

inherit rpm
