SUMMARY = "Enhanced Base System"
DESCRIPTION = "The 32bit pattern complementing enhanced_base."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-enhanced_base-32bit-20200505-42.1.aarch64.rpm"
RPM_HASH = "22eab4f9e1e19392ac8c8332b37506eff5af377eb3f087069bee459865ced0fccc17dcc00d4df1fb525bb4695e5a9a7a9ea7aee5ade636b0adaa72b15b7d17ca"

RPROVIDES:${PN} += "pattern- \
patterns-base-enhanced-base-32bit"

RDEPENDS:${PN} += ""

inherit rpm
