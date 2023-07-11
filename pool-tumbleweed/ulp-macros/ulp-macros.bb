SUMMARY = "Macros for enabling Userspace Live Patching into processes"
DESCRIPTION = "This package contain macros for enabling Userspace Live Patching into packages"
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "ulp-macros-1.0-1.1.noarch.rpm"
RPM_HASH = "58c196732234651e0aff31720a7359ea802bc8351ca2393acf39fdf0922601dac14cee1964f5777b6ec7bd1392ae7a0d635eb4b93b6bd378fb795c33d2285f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-cflags-livepatching \
rpm-macro-clones-dest-dir \
rpm-macro-pack-ipa-dumps \
rpm-macro-tar-lp-basename \
rpm-macro-tar-lp-package-name \
ulp-macros"

RDEPENDS:${PN} += ""

inherit rpm
