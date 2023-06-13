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

PV = "0.7.8.6"

RPM_NAME = "iscsiuio-0.7.8.6-99.1.aarch64.rpm"
RPM_HASH = "5c029830e0f178765b25f3dda5f15198f75ca5230be23fd1045f468a1991f6e2367fc12ea13d0d8b511d12898ee85fe85454c165e0bfec69b1fbea8b8f7efaba"

RPROVIDES:${PN} += "iscsiuio \
iscsiuio(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
logrotate"

inherit rpm
