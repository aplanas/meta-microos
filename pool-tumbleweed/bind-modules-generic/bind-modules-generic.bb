SUMMARY = "DLZ module which store zone data in plain files"
DESCRIPTION = "This package provides the externally loadable filesystem DLZ module, without \
update support and the externally loadable wildcard DLZ module. \
The 'wildcard' DLZ module provides a 'template' zone for domains matching \
a wildcard name. \
For any zone name matching the wildcard, it would return the data from \
the template.  '$zone$' is replaced with zone name: i.e., the shortest \
possible string of labels in the query name that matches the wildcard."
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-modules-generic-9.18.16-2.1.aarch64.rpm"
RPM_HASH = "7987109e674c97afaa2dd41fc6604427db4e1941fd25a8baca73941341ec51a68bfe95012238343d6f8e176f44e64c29ed077d42aa6e86eebdf5583c19c2e0c1"

RPROVIDES:${PN} += "bind-modules-generic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
