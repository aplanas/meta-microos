SUMMARY = "Libsoup bindings for Mono"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
This package provides the mono bindings for libsoup."
LICENSE = "LGPL-3.0"

PV = "2.42.2+git.20141217.4404312"

RPM_NAME = "soup-sharp-2.42.2+git.20141217.4404312-2.11.aarch64.rpm"
RPM_HASH = "3f2efa63cd955b7e66714e512549e1402de4f5e772869e5ea56f124d2224c7d7724a9e4bc0458aaa1a4ed85d0d9d9b06e798d53386667eb26d0795f4b086e9f1"

RPROVIDES:${PN} += "libsoupsharpglue-2.42.2.so \
mono-soup-sharp \
soup-sharp"

RDEPENDS:${PN} += "mono-mscorlib"

inherit rpm
