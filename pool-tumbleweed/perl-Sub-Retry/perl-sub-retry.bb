SUMMARY = "Retry $N Times"
DESCRIPTION = "Sub::Retry provides the function named 'retry'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-Sub-Retry-0.06-1.16.noarch.rpm"
RPM_HASH = "342fd5f6b2a58f8f5450a334fe6683f301a6fa1e5f4523b474edb09f6600a134368390286f959c946e03d82885040bd8e8bc0a4cc3dd3fbb47bc83cdf50393e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Sub::Retry) \
perl-Sub-Retry"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(parent)"

inherit rpm
