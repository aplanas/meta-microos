SUMMARY = "Macros to limit resources allocation when building"
DESCRIPTION = "Macros to limit various resources when building huge packages to \
ensure we can produce results rather than OOM reports."
LICENSE = "MIT"

PV = "20180406"

RPM_NAME = "memory-constraints-20180406-4.6.noarch.rpm"
RPM_HASH = "b76c5f076c0e0ac76d0d2e436748c3eb6590000b20c3901f9faa305adcb5fdc339f308591e542ffa2b2b974d382528a0656004365a4e199c5c5bb0be172496a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "memory-constraints \
rpm-macro-limit-build"

RDEPENDS:${PN} += "/usr/bin/awk \
coreutils"

inherit rpm
