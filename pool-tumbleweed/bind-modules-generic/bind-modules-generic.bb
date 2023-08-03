SUMMARY = "DLZ module which store zone data in plain files"
DESCRIPTION = "This package provides the externally loadable filesystem DLZ module, without \
update support and the externally loadable wildcard DLZ module. \
The 'wildcard' DLZ module provides a 'template' zone for domains matching \
a wildcard name. \
For any zone name matching the wildcard, it would return the data from \
the template.  '$zone$' is replaced with zone name: i.e., the shortest \
possible string of labels in the query name that matches the wildcard."
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-modules-generic-9.18.17-1.1.aarch64.rpm"
RPM_HASH = "b1acccc28aaa1a3dc2563502cac661305e1627b5ea8b8c86c89ba635cbf4f016e5f887c1244757cd109b973993ac40b3ff6bb2869648ddad8f4a00d33d471837"

RPROVIDES:${PN} += "bind-modules-generic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
