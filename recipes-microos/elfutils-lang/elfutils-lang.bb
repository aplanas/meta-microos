SUMMARY = "Translations for package elfutils"
DESCRIPTION = "Provides translations for the 'elfutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-lang-0.189-3.1.noarch.rpm"
RPM_HASH = "0bacc18ef04e0e0cf9215c01df92cefc22621d68d20a3d475177a4ce32c2e269e740a048598ddba608b16bb55dd9c8f2a7d6393c5dc56934514dfcaf9e8d4f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elfutils-lang elfutils-lang-all locale(elfutils:de) locale(elfutils:en@boldquot) locale(elfutils:en@quot) locale(elfutils:es) locale(elfutils:ja) locale(elfutils:pl) locale(elfutils:uk)"
RDEPENDS:${PN} += "elfutils"

inherit rpm
