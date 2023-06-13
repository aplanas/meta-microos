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

RPM_NAME = "perl-Guard-1.023-1.35.aarch64.rpm"
RPM_HASH = "a0f3c798fe6ae82489f10632ed2e01164db2e66d96ad314e1bd069bb55602ac5b6a53d05f7c422fa9bcf2b3bc5074597259b8d5c72246d452380abb18769ef3b"

RPROVIDES:${PN} += "perl(Guard) \
perl-Guard \
perl-Guard(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
