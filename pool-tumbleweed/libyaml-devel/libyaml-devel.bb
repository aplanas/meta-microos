SUMMARY = "Development files for libyaml"
DESCRIPTION = "This package holds the development files for libyaml, \
a YAML parser and emitter written in C."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "libyaml-devel-0.2.5-2.3.aarch64.rpm"
RPM_HASH = "4c96ae2d9b4f95d09135534d09148e8b5ff780b43ce0f56fba366995f561c00d27da927a0a16e5ace928c49e5d708bf924454ccd6f80d1ce9810a1dcd3a64077"

RPROVIDES:${PN} += "libyaml-devel \
pkgconfig-yaml-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyaml-0-2"

inherit rpm
