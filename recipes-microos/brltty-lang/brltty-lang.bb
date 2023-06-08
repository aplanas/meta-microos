SUMMARY = "Translations for package brltty"
DESCRIPTION = "Provides translations for the 'brltty' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-lang-6.5-2.3.noarch.rpm"
RPM_HASH = "f0d7fee46a6a0c96b08dba769505bc8097386e3c293af484c30c1becb4301967490b9db041702bf3233ffb24c44ed95cf4a11245968a3c52d2fbb3684bd0d842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brltty-lang brltty-lang-all locale(brltty:ar) locale(brltty:de) locale(brltty:fr) locale(brltty:it) locale(brltty:ru) locale(brltty:zh)"
RDEPENDS:${PN} += "brltty"

inherit rpm
