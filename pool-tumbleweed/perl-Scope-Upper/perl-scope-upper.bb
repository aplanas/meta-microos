SUMMARY = "Act on upper scopes"
DESCRIPTION = "This module lets you defer actions _at run-time_ that will take place when \
the control flow returns into an upper scope. Currently, you can: \
 \
  * hook an upper scope end with reap ; \
 \
  * localize variables, array/hash values or deletions of elements in higher \
contexts with respectively localize, localize_elem and localize_delete ; \
 \
  * return values immediately to an upper level with unwind, yield and leave ; \
 \
  * gather information about an upper context with want_at and context_info ; \
 \
  * execute a subroutine in the setting of an upper subroutine stack frame with \
uplevel ; \
 \
  * uniquely identify contexts with uid and validate_uid."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.34"

RPM_NAME = "perl-Scope-Upper-0.34-1.2.aarch64.rpm"
RPM_HASH = "37ae359c67b4772b8b96c02a1675b8fd97fdeceda43028bf5b715e9af5c9305a07fe450b88eaa9ca38142719de58626cb5bc5915e167132eabeea81cc988f38e"

RPROVIDES:${PN} += "perl-Scope--Upper \
perl-Scope-Upper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
