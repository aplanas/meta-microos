SUMMARY = "DLZ module which store zone data in plain files"
DESCRIPTION = "This package provides the externally loadable filesystem DLZ module, without \
update support and the externally loadable wildcard DLZ module. \
The 'wildcard' DLZ module provides a 'template' zone for domains matching \
a wildcard name. \
For any zone name matching the wildcard, it would return the data from \
the template.  '$zone$' is replaced with zone name: i.e., the shortest \
possible string of labels in the query name that matches the wildcard."
LICENSE = "MPL-2.0"

PV = "9.18.14"

RPM_NAME = "bind-modules-generic-9.18.14-1.1.aarch64.rpm"
RPM_HASH = "35de85a20629fba1879ec59528d990309b822236b4bad9ebfbeaab86889ffb5fe6255fc68b4aac7f25c04f716494aabdb6603baa6a3e6152c976385342bef857"

RPROVIDES:${PN} += "bind-modules-generic bind-modules-generic(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
