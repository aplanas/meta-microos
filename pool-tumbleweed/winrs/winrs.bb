SUMMARY = "Windows Remote Shell"
DESCRIPTION = "This is a command line tool for the Windows Remote Shell protocol. \
It can be used to send shell commands to remote Windows hosts."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "winrs-2.7.2-2.5.noarch.rpm"
RPM_HASH = "1bbfef1d53165c46c40d2f207afa28844230decea673d4b5c57a24029324f32c07d12cbafe8f157986ee125112ea5593a1f1edbc73edec37bba309093e7fb7bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "winrs"

RDEPENDS:${PN} += "/usr/bin/ruby \
openwsman-ruby"

inherit rpm
