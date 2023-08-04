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

RPM_NAME = "bind-modules-generic-9.18.17-1.2.aarch64.rpm"
RPM_HASH = "14c6597e3cda89e1bd2a2bb4c55d5ed0267effe0b813174a05d48f5610787037d92c9c7f801e607f9bb122ccc26f99b7b9d41d0a26168d317a916c5c768ea21a"

RPROVIDES:${PN} += "bind-modules-generic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
