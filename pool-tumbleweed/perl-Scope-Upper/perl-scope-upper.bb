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

RPM_NAME = "perl-Scope-Upper-0.34-1.1.aarch64.rpm"
RPM_HASH = "9520aa9c63f5bbcdaf1830be7a1aac7a221c55e22c3f59f9d8e778d73483d8df694b8ad97a9fbe2e783cb91a7b860a12ce70fecd2cdec80cbff3bc799124f323"

RPROVIDES:${PN} += "perl(Scope::Upper) \
perl-Scope-Upper \
perl-Scope-Upper(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
