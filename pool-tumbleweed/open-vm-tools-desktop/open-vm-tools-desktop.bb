SUMMARY = "User experience components for Open Virtual Machine Tools"
DESCRIPTION = "This package contains only the user-space programs and libraries of \
open-vm-tools that are essential for improved user experience of VMware virtual \
machines."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.3.0"

RPM_NAME = "open-vm-tools-desktop-12.3.0-1.1.aarch64.rpm"
RPM_HASH = "50ff207e47eafa5b2347cb30b535deab94f6e8d49678349c4f2c5c7ac5ad9268098a4efbe8e5d89eec19531ba82ac34a685c1f643bbb86ea64c8714d7f0827cd"

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
