SUMMARY = "Fish completion for wl-clipboard"
DESCRIPTION = "Fish command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "wl-clipboard-fish-completion-2.1.0-1.7.noarch.rpm"
RPM_HASH = "cffdbf4dba28ad7a088c7efc81595592c458c1dfad0ca1161ff9c0abe881c90550fc4abdb582f44b7654349d3c3792a9872d47524d9a037180c97c046a7af231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-fish-completion"

RDEPENDS:${PN} += "wl-clipboard"

inherit rpm
