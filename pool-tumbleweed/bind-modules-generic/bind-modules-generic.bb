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

RPM_NAME = "bind-modules-generic-9.18.16-3.1.aarch64.rpm"
RPM_HASH = "e15234caaa56c1dfb87710422307797ca5ac113826dfaeda21213c7ac6a201882e2137aba9a0248975c6fd638fe899e16848939aa84955982fa81bba445cbe53"

RPROVIDES:${PN} += "bind-modules-generic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
