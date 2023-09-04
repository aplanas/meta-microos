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

RPM_NAME = "perl-Scope-Upper-0.34-1.3.aarch64.rpm"
RPM_HASH = "ca177300d774ca6f87bdc4a05d8e943985b5289753b20bdbd424bd128fda1c25748ee4d720688319380a5bb258e324f5bbb02e61653137304a3f84a03fbe2841"

RPROVIDES:${PN} += "perl-Scope--Upper \
perl-Scope-Upper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
