SUMMARY = "The system GNU Objective C Compiler"
DESCRIPTION = "The system GNU Objective C Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-objc-13-1.3.aarch64.rpm"
RPM_HASH = "8a6bdc83a230161346ffd0948b861fa5bb91f9a927409e62f8894bf2d4a43cdfa6f87df7143ad519cd740375a1edeab7c75620bba90d398d3b0a136020cfafed"

RPROVIDES:${PN} += "gcc-objc \
gcc-objc(aarch-64)"
RDEPENDS:${PN} += "gcc \
gcc13-objc"

inherit rpm
