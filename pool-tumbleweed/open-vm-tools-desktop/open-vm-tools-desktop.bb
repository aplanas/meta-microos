SUMMARY = "User experience components for Open Virtual Machine Tools"
DESCRIPTION = "This package contains only the user-space programs and libraries of \
open-vm-tools that are essential for improved user experience of VMware virtual \
machines."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-desktop-12.2.0-5.1.aarch64.rpm"
RPM_HASH = "e5c1f1f1e0e8cbd666a605f7059d08138cf61a1c566764e89614931236b7e4b911fe9925d755a4e7840d89b2c9cce38c30749ce2f225a63ce67728dc19aa6173"

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
