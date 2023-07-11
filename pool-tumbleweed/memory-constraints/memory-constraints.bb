SUMMARY = "Macros to limit resources allocation when building"
DESCRIPTION = "Macros to limit various resources when building huge packages to \
ensure we can produce results rather than OOM reports."
LICENSE = "MIT"

PV = "20180406"

RPM_NAME = "memory-constraints-20180406-4.7.noarch.rpm"
RPM_HASH = "3e6876b7f8087aba48547d3ef4e04edfb1cbf173cbae3ca4f6fab87ff435b91d13fdccc5b63362d2c41212dcb24ffe8db3bfc346c3422452e731fc262111eee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "memory-constraints \
rpm-macro-limit-build"

RDEPENDS:${PN} += "/usr/bin/awk \
coreutils"

inherit rpm
