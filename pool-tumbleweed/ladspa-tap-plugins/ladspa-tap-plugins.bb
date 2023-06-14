SUMMARY = "LADSPA TAP plugins"
DESCRIPTION = "This package provides a collection of LADSPA (Linux Audio Developer's \
Simple Plug-in API) TAP plugins, short for Tom's Audio Processing, \
which contains a collection of various audio plugins."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "ladspa-tap-plugins-1.0.1-1.14.aarch64.rpm"
RPM_HASH = "221a6aa7ea9367fed4e17b1cc0a2f1a7ca44c52851f68ca2cb8dfd5c5fc93d0a0eaefb9801a5021661a9f13c4ae72eca9a3e6a4848ba3c7e139864739df8e0ee"

RPROVIDES:${PN} += "ladspa-tap-plugins"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
