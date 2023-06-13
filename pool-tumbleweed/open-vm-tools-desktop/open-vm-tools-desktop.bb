SUMMARY = "User experience components for Open Virtual Machine Tools"
DESCRIPTION = "This package contains only the user-space programs and libraries of \
open-vm-tools that are essential for improved user experience of VMware virtual \
machines."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-desktop-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "a55b6e003ca9ee0e7914ab2f250864d9d8cf55778700acb45075b96c2698139c63d61da01cd83e7ad4006b6c832b7a361eb037ce091ef99f8ffcaba636fa8da9"

RPROVIDES:${PN} += "config(open-vm-tools-desktop) \
libdesktopEvents.so()(64bit) \
libdndcp.so()(64bit) \
libresolutionSet.so()(64bit) \
open-vm-tools-desktop \
open-vm-tools-desktop(aarch-64) \
open-vm-tools-gui"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libdrm.so.2()(64bit) \
libfuse3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libhgfs.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtirpc.so.3()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libvmtools.so.0()(64bit) \
open-vm-tools(aarch-64) \
permissions"

inherit rpm
