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

RPM_NAME = "patterns-base-fips-20200505-41.1.aarch64.rpm"
RPM_HASH = "d0a424603fbe8d04decd2f192129e44b6f06e9783a30b57c37693d0beefe6fa635eacc348394f77f26e984e5594c2836debf1e0b07c6e87ed7d64b0e2ca93a88"

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
