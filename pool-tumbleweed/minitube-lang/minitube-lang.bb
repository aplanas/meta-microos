SUMMARY = "Translations for package minitube"
DESCRIPTION = "Provides translations for the 'minitube' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "minitube-lang-3.9.3-1.9.noarch.rpm"
RPM_HASH = "fc87030e893a6806ba37d6221f94e72024fed5c502af853f61d83a1bff834fa70f313aab81b018fb6f2aaf140396efdc9cfb70548406062e89367df6ec9feea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minitube-lang \
minitube-lang-all"

RDEPENDS:${PN} += "minitube"

inherit rpm
