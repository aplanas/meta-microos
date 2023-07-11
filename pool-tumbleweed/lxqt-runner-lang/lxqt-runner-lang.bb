SUMMARY = "Translations for package lxqt-runner"
DESCRIPTION = "Provides translations for the 'lxqt-runner' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-runner-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "930b3dba2bd65a1f65a50855ad946c7df0fa3f3d86e7abf844a7e227e3a00a88555873607613fd117c3c768a703fcbb2fe0de8645e1f0e33da12d96c13a714cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-runner-lang \
lxqt-runner-lang-all"

RDEPENDS:${PN} += "lxqt-runner"

inherit rpm
