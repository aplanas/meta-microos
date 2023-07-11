SUMMARY = "Fish completion for ansifilter"
DESCRIPTION = "This package provides Fish command-line completion support for ansifilter."
LICENSE = "GPL-3.0-or-later"

PV = "2.20"

RPM_NAME = "ansifilter-fish-completion-2.20-1.1.noarch.rpm"
RPM_HASH = "9f0ef73a9e9f900da533e23446681044c239070375977e4b4dd530fcc30a1d92cf1093f7479c204a0e46298b494a45ff1780819d4240565271acc7807c409f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansifilter-fish-completion"

RDEPENDS:${PN} += "ansifilter \
fish"

inherit rpm
