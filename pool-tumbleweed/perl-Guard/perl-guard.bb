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

RPM_NAME = "perl-Guard-1.023-1.36.aarch64.rpm"
RPM_HASH = "d08c51719b6d44d56477d80f33c245f8c0818afc140ac3c75a2cc1588e5171be702bac709d007e7fe711a3207f20ef26ceaa943a312bb4eda3e4dcd004dd2477"

RPROVIDES:${PN} += "perl-Guard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
