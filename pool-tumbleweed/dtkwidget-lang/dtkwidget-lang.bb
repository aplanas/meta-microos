SUMMARY = "Translations for package dtkwidget"
DESCRIPTION = "Provides translations for the 'dtkwidget' package."
LICENSE = "LGPL-3.0-only"

PV = "5.5.52"

RPM_NAME = "dtkwidget-lang-5.5.52-1.7.noarch.rpm"
RPM_HASH = "5af8d756fb7b87dcdb173c6c547d03912c74706b20ec3f818f950cbf090eb72d9bc2136897a544af39d49d6ede1e2370e4e901650da07d023e385a5fa975b977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtkwidget-lang \
dtkwidget-lang-all"

RDEPENDS:${PN} += "dtkwidget"

inherit rpm
