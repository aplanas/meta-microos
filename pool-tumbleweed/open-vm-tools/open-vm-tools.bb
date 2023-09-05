SUMMARY = "Open Virtual Machine Tools"
DESCRIPTION = "Open Virtual Machine Tools (open-vm-tools) are the open source \
implementation of VMware Tools. They are a set of guest operating \
system virtualization components that enhance performance and user \
experience of virtual machines. As virtualization technology rapidly \
becomes mainstream, each virtualization solution provider implements \
their own set of tools and utilities to supplement the guest virtual \
machine. However, most of the implementations are proprietary and are \
tied to a specific virtualization platform. \
 \
With the Open Virtual Machine Tools project, we are hoping to solve \
this and other related problems. The tools are currently composed of \
kernel modules for Linux and user-space programs for all VMware \
supported Unix-like guest operating systems. They provide several \
useful functions like: \
 \
* File transfer between a host and guest \
 \
* Improved memory management and network performance under \
   virtualization \
 \
* General mechanisms and protocols for communication between host and \
guests and from guest to guest"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-12.2.0-6.1.aarch64.rpm"
RPM_HASH = "d54603c8a379d50430645ee2b19f6de4e2bd04fd8cca8d99755be65e1f230be8680c2a362dedb8de9a728dd7f07be9cbb2a0ac97eb7b021e28b6ec23471e96a0"

RPROVIDES:${PN} += "config-open-vm-tools \
libappInfo.so \
libcomponentMgr.so \
libdeployPkgPlugin.so \
libgdp.so \
libguestInfo.so \
libguestStore.so \
libhgfsServer.so \
libpowerOps.so \
libresolutionKMS.so \
libtimeSync.so \
libvix.so \
libvmbackup.so \
open-vm-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libDeployPkg.so.0 \
libc.so.6 \
libcrypto.so.3 \
libdrm.so.2 \
libfuse3.so.3 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libguestlib.so.0 \
libhgfs.so.0 \
libssl.so.3 \
libtirpc.so.3 \
libudev.so.1 \
libvgauth.so.0 \
libvmtools.so.0 \
libvmtools0 \
libxml2.so.2 \
libxmlsec1-openssl1 \
libxmlsec1.so.1 \
net-tools \
tar \
which"

inherit rpm
