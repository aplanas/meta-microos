SUMMARY = "Base System (alias pattern for base)"
DESCRIPTION = "This is the base runtime system.  It contains only a basic multiuser booting system. For running on real hardware, you need to add additional packages and pattern to make this pattern useful on its own."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-basesystem-20200505-42.1.aarch64.rpm"
RPM_HASH = "971f05c55cb091f0671cab5a80276843588ba22de99b3b042fb5a6b44d596286e97fca1ada82414fcbc791891b25e72e1d3ec7ad80de96fe11755f33beed3a50"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
patterns-base-basesystem"

RDEPENDS:${PN} += "pattern-"

inherit rpm
