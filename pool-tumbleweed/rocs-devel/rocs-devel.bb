SUMMARY = "Development files for Rocs"
DESCRIPTION = "This package provides development files and headers needed \
to build software using Rocs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "rocs-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "40d1b16c60c4bba9f47e925e9556a824b0ea4347698f8919761ccad6b745661ca952ffeb0453027d16ec586362d75f03b368cfbd3b0a57d64a56971ffaa59cc1"

RPROVIDES:${PN} += "rocs-devel \
rocs-devel(aarch-64)"

RDEPENDS:${PN} += "librocsgraphtheory0"

inherit rpm
