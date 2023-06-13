SUMMARY = "Greek (ελληνικά) Dictionary for Aspell"
DESCRIPTION = "A Greek (ελληνικά) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.3+0.08"

RPM_NAME = "aspell-el-0.50.3+0.08-2.14.aarch64.rpm"
RPM_HASH = "9d6f901e58635bde66d61136e37f384a929c72ea52cde5742510a6b8dcaf15b888b0367a64fdab27ee724607ca2fcca02b2e1b586607653a838a33902cfe0f9d"

RPROVIDES:${PN} += "aspell-el \
aspell-el(aarch-64) \
locale(aspell:el)"

RDEPENDS:${PN} += ""

inherit rpm
