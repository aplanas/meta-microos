SUMMARY = "FIPS 140-2 specific packages"
DESCRIPTION = "This pattern installs the FIPS 140-2 specific packages that complete the various \
cryptographic modules in use. It is required if you want to run the \
machine with 'fips=1'. \
 \
Please note that this pattern only enables FIPS 140-2 compliant operation, it does \
not directly make the system FIPS 140-2 certified nor validated. \
 \
Please refer to SUSE official statements on the state of FIPS 140-2 certification."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-fips-20200505-42.1.aarch64.rpm"
RPM_HASH = "089796b34058241d2a8bb1b621f364abeb12a1cf15816a0548c8f67565d0f7d68d14a4f8f6e06f57a3a3ec3e130276b75cb03be9d23f0a657885c744ee282bb1"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-fips \
patterns-server-enterprise-fips \
patterns-server-enterprise-fips-32bit \
patterns-sles-fips"

RDEPENDS:${PN} += ""

inherit rpm
