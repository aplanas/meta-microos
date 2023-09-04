SUMMARY = "User experience components for Open Virtual Machine Tools"
DESCRIPTION = "This package contains only the user-space programs and libraries of \
open-vm-tools that are essential for improved user experience of VMware virtual \
machines."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-desktop-12.2.0-5.2.aarch64.rpm"
RPM_HASH = "2e211f169a0e1f7a071b73f2c78c8141b9e7fa0d1c5dbf371d9d180eb84acc1d8978cf8b90183ce1ce84b6f957d7f55f2c66daff87447c7915d18d72ecb03c80"

RPROVIDES:${PN} += "config-open-vm-tools-desktop \
libdesktopEvents.so \
libdndcp.so \
libresolutionSet.so \
open-vm-tools-desktop \
open-vm-tools-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXtst.so.6 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libdrm.so.2 \
libfuse3.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libhgfs.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libtirpc.so.3 \
libudev.so.1 \
libvmtools.so.0 \
open-vm-tools \
permissions"

inherit rpm
