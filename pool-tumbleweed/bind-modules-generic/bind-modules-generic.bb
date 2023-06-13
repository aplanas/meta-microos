SUMMARY = "DLZ module which store zone data in plain files"
DESCRIPTION = "This package provides the externally loadable filesystem DLZ module, without \
update support and the externally loadable wildcard DLZ module. \
The 'wildcard' DLZ module provides a 'template' zone for domains matching \
a wildcard name. \
For any zone name matching the wildcard, it would return the data from \
the template.  '$zone$' is replaced with zone name: i.e., the shortest \
possible string of labels in the query name that matches the wildcard."
LICENSE = "MPL-2.0"

PV = "9.18.15"

RPM_NAME = "bind-modules-generic-9.18.15-1.1.aarch64.rpm"
RPM_HASH = "11cf83bd082d96bd9d033015e80c424e455aca8c4bc7584c8bf6054f90eccc705cea8bf5b585acf049a9930957cf5e66e419f6d08be0596a4286f77d2c7e1532"

RPROVIDES:${PN} += "bind-modules-generic \
bind-modules-generic(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
