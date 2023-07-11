SUMMARY = "Translations for package kdesdk-scripts"
DESCRIPTION = "Provides translations for the 'kdesdk-scripts' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.3"

RPM_NAME = "kdesdk-scripts-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "039134abe9c4ef9042dfad05e743ab2ef370eeb81e3cce2898f62ae8ef98551d02cb6aa6bc6d3b6be1365ebe29aff18853ad04ac3470c700ab6f2ea6c3be5cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdesdk-scripts-lang \
kdesdk-scripts-lang-all"

RDEPENDS:${PN} += "kdesdk-scripts"

inherit rpm
