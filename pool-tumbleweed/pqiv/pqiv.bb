SUMMARY = "Minimalist image viewer"
DESCRIPTION = "pqiv is a powerful GTK 3 based command-line image viewer with a minimal UI. It \
is highly customizable, can be fully controlled from scripts, and has support \
for various file formats including PDF, Postscript, video files and archives. \
It is optimized to be quick and responsive. \
It comes with support for animations, slideshows, transparency, VIM-like key \
bindings, automated loading of new images as they appear, external image \
filters, image preloading, and much more. \
pqiv started as a Python rewrite of qiv avoiding imlib, but evolved into a much \
more powerful tool. Today, pqiv stands for powerful quick image viewer. \
Features: \
 * Command line image viewer \
 * Directory traversing to view whole directories \
 * Watch files and directories for changes \
 * Natural order sorting of the images \
 * A status bar showing information on the current image \
 * Transparency and animation support \
 * Moving, zooming, rotation, flipping \
 * Slideshows \
 * Highly customizable and scriptable \
 * Supports external image filters (e.g. `convert`) \
 * Preloads the next image in the background \
 * Fade between images \
 * Optional PDF/eps/ps support (useful e.g. for scientific plots) \
 * Optional video format support (e.g. for webm animations)"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-2.12-1.4.aarch64.rpm"
RPM_HASH = "6c3a298838a510203ab705c7a47e9480893f07e5ea0622a6aa8bc9c3cefbea71db362ef75ccbe7e1f9e6d16a83efb9659e5795cdc1e278fe61670804695fc797"

RPROVIDES:${PN} += "pqiv"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
