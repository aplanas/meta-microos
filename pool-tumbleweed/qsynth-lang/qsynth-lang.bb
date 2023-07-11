SUMMARY = "Translations for package qsynth"
DESCRIPTION = "Provides translations for the 'qsynth' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.10"

RPM_NAME = "qsynth-lang-0.9.10-1.2.noarch.rpm"
RPM_HASH = "3033f2951b9633f14623bdc394c43cd5b3fb5cd0fb3b59003d6800e71c2b31f18f4ae54a62d4d79e316650e8fbad4a987b36f08807b723ba687cb5dfdeaea795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qsynth-lang \
qsynth-lang-all"

RDEPENDS:${PN} += "qsynth"

inherit rpm
