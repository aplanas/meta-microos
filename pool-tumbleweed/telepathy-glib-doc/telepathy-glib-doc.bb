SUMMARY = "GObject-based library for the Telepathy D-Bus API -- Developer documentation"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "telepathy-glib-doc-0.24.2-1.10.aarch64.rpm"
RPM_HASH = "e6f8a81a225a3bae037642061e5604ca283b9f1de5639e94052c7982685f407d07f467c74ddc0def43d427b872b1894e38d62ac88ba331e4f0b9670295a87a0a"

RPROVIDES:${PN} += "telepathy-glib-doc \
telepathy-glib-doc(aarch-64)"
RDEPENDS:${PN} += "libtelepathy-glib0"

inherit rpm
