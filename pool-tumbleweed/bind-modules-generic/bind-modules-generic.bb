SUMMARY = "DLZ module which store zone data in plain files"
DESCRIPTION = "This package provides the externally loadable filesystem DLZ module, without \
update support and the externally loadable wildcard DLZ module. \
The 'wildcard' DLZ module provides a 'template' zone for domains matching \
a wildcard name. \
For any zone name matching the wildcard, it would return the data from \
the template.  '$zone$' is replaced with zone name: i.e., the shortest \
possible string of labels in the query name that matches the wildcard."
LICENSE = "MPL-2.0"

PV = "9.18.18"

RPM_NAME = "bind-modules-generic-9.18.18-1.1.aarch64.rpm"
RPM_HASH = "a4e3b18e56789049e37ef1937a87cdee593465623bbb8689e794f219eb2fd9a61af44481213343a14a56a6375e16a32c8e3cdb0eee36a084acb07d920cb3ffca"

RPROVIDES:${PN} += "bind-modules-generic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
