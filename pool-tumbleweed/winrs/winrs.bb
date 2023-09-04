SUMMARY = "Windows Remote Shell"
DESCRIPTION = "This is a command line tool for the Windows Remote Shell protocol. \
It can be used to send shell commands to remote Windows hosts."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "winrs-2.7.2-2.9.noarch.rpm"
RPM_HASH = "342aa07bdff09587765e260efbd279a3447fc60681504bb6e02fa3f2b004ba6c4bfd7c7160a1b760e1084ca31183c05a4e5623cc1214c0578dd34c967ce1668e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "winrs"

RDEPENDS:${PN} += "/usr/bin/ruby \
openwsman-ruby"

inherit rpm
