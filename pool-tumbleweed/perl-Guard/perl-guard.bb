SUMMARY = "Safe Cleanup Blocks"
DESCRIPTION = "This module implements so-called 'guards'. A guard is something (usually an \
object) that 'guards' a resource, ensuring that it is cleaned up when \
expected. \
 \
Specifically, this module supports two different types of guards: guard \
objects, which execute a given code block when destroyed, and scoped \
guards, which are tied to the scope exit."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.023"

RPM_NAME = "perl-Guard-1.023-1.37.aarch64.rpm"
RPM_HASH = "32a96c35ace7f703a6a5668695ca7bc004dbd614bcd1e4d40793b90c081a842df9c078aa109e115b272a54803bdf5dd48fe654e8f82869b01a38c0af8804a3a7"

RPROVIDES:${PN} += "perl-Guard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
