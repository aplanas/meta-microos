SUMMARY = "Translations for package qpdfview"
DESCRIPTION = "Provides translations for the 'qpdfview' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-lang-0.5.0-1.4.noarch.rpm"
RPM_HASH = "d85c70bfbfbe14f7c915562fa46c413c1acd57cbff9319f75cafe49106b3d005e691875016a85d83a817d17930db6c749f22ff0df98f66a3b050d24a2f5036b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpdfview-lang \
qpdfview-lang-all"

RDEPENDS:${PN} += "qpdfview"

inherit rpm
