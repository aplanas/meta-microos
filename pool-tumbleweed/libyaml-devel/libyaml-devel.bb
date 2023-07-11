SUMMARY = "Development files for libyaml"
DESCRIPTION = "This package holds the development files for libyaml, \
a YAML parser and emitter written in C."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "libyaml-devel-0.2.5-2.4.aarch64.rpm"
RPM_HASH = "f7e4f11fc9660718036577ef542b47355fc3df751ee4e158980ead0bef100fd20b7d41065fbe6fcc1f11dc07ddbee10d123ee922ebe9b81f984333f2760ced03"

RPROVIDES:${PN} += "libyaml-devel \
pkgconfig-yaml-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyaml-0-2"

inherit rpm
