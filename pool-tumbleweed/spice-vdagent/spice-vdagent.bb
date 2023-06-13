SUMMARY = "Agent for Spice guests"
DESCRIPTION = "Spice agent for Linux guests offering the following features: \
 \
Features: \
* Client mouse mode (no need to grab mouse by client, no mouse lag) \
  this is handled by the daemon by feeding mouse events into the kernel \
  via uinput. This will only work if the active X-session is running a \
  spice-vdagent process so that its resolution can be determined. \
* Automatic adjustment of the X-session resolution to the client resolution \
* Support of copy and paste (text and images) between the active X-session \
  and the client"
LICENSE = "GPL-3.0-or-later"

PV = "0.22.1"

RPM_NAME = "spice-vdagent-0.22.1-4.3.aarch64.rpm"
RPM_HASH = "f2275a8939e3dce549e393cdf5b18118208b92a4ecb254d7cd6d5212b075fb0d69725e82cf942434fcc19afa39780d61e963815e5b7e1a9e93e9aec333b89c99"

RPROVIDES:${PN} += "spice-vdagent \
spice-vdagent(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdrm.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpciaccess.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
systemd"

inherit rpm
