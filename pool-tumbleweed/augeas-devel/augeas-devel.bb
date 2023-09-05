SUMMARY = "A library for changing configuration files"
DESCRIPTION = "A library for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure, which it exposes \
through its public API. Changes made through the API are written back \
to the initially read files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "augeas-devel-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "fb6f3f322af5b4bdd42d5cbdde4f3965caff6a8d7710b099a4d5fb40c24bd8cfe7528b220ee2c497504d48028969c321e485b5751c176b657fa8645f95301028"

RPROVIDES:${PN} += "augeas-devel \
pkgconfig-augeas"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaugeas0 \
libfa1 \
pkgconfig-libxml-2.0"

inherit rpm
