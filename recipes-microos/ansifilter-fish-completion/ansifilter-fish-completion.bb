SUMMARY = "Fish completion for ansifilter"
DESCRIPTION = "This package provides Fish command-line completion support for ansifilter."
LICENSE = "GPL-3.0-or-later"

PV = "2.19"

RPM_NAME = "ansifilter-fish-completion-2.19-1.3.noarch.rpm"
RPM_HASH = "f4545037027c93ca72d3a7561f6276aaaafab4e622aa34694e42fc1f59c45d950de29c3670b687df4c5b05f1fb9321892e373fb226714939fbc67342361bf0d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansifilter-fish-completion"
RDEPENDS:${PN} += "ansifilter \
fish"

inherit rpm
