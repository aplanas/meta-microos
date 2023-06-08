SUMMARY = "Translations for package elfutils"
DESCRIPTION = "Provides translations for the 'elfutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-lang-0.189-2.3.noarch.rpm"
RPM_HASH = "4fe10158017f8dd9bdcf8a1933a3fc0852960d40fff74d335640872081f1dd2aedb878ca9377b1662c1b0b4e6db86fce8a0dfaea2b952c50600bbc4cab2b7966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elfutils-lang elfutils-lang-all locale(elfutils:de) locale(elfutils:en@boldquot) locale(elfutils:en@quot) locale(elfutils:es) locale(elfutils:ja) locale(elfutils:pl) locale(elfutils:uk)"
RDEPENDS:${PN} += "elfutils"

inherit rpm
