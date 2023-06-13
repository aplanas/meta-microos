SUMMARY = "Command-line productivity booster, offers quick access to files and directories"
DESCRIPTION = "Fasd (pronounced similar to 'fast') is a command-line productivity booster. Fasd offers quick access to files and directories for \
POSIX shells. It is inspired by tools like autojump, z and v. Fasd keeps track of files and directories you have accessed, so that \
you can quickly reference them in the command line. \
 \
The name fasd comes from the default suggested aliases f(files), a(files/directories), s(show/search/select), d(directories). \
 \
Fasd ranks files and directories by 'frecency,' that is, by both 'frequency' and 'recency.' The term 'frecency' was first coined \
by Mozilla and used in Firefox."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "fasd-1.0.1-1.14.noarch.rpm"
RPM_HASH = "0531a505250cbc7a3bbb2dd35c03d70cb4d0989090336348532745a7ab28309d964c3e30e4a2a06c896a5ebb5455c90462af0040d3f1d35fddaf70f7bc86fb0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fasd"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
