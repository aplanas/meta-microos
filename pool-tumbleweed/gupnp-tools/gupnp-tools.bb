SUMMARY = "UPnP tools to test and debug UPnP devices and control points"
DESCRIPTION = "GUPnP Tools are free replacements of Intel UPnP tools that use GUPnP. \
They provides the following client and server side tools which enable \
one to easily test and debug one's UPnP devices and control points: \
 \
  * Universal Control Point: a tool that enables one to discover UPnP \
    devices and services, retrieve information about them, subscribe to events \
    and invoke actions. \
 \
  * Network Light: a virtual light bulb that allows control points to \
    switch it on and off, change its dimming level and query its current \
    status. It also provides a simple UI to control all the network lights \
    available on the network. \
 \
  * AV Control Point: a simple media player UI that enables one to \
    discover and play multimedia contents available on a network. It is \
    strictly a control point and therefore does not have any playback \
    capabilities of it's own and relies on external UPnP MediaRenderer devices \
    for actual playback. \
 \
  * Upload: a simple commandline utility that uploads files to known \
    MediaServers. Use Universal Control Point for discovering the \
    MediaServers."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.1"

RPM_NAME = "gupnp-tools-0.12.1-1.1.aarch64.rpm"
RPM_HASH = "72eeaabf0a33ff65710313d8717f52d328b9b29dd8535ea0ca18b74eb93865fa46e248a23ab7302ac1a5943b488316147444657ccab8c492c0dc8541a3d08847"

RPROVIDES:${PN} += "gupnp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libgupnp-1.6.so.0 \
libgupnp-av-1.0.so.3 \
libsoup-3.0.so.0 \
libxml2.so.2"

inherit rpm
