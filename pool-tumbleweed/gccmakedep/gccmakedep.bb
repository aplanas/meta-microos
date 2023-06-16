SUMMARY = "Utility to list the resource database of an X application"
DESCRIPTION = "The gccmakedep program calls 'gcc -M' to output makefile rules \
describing the dependencies of each sourcefile, so that make knows \
which object files must be recompiled when a dependency has changed."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "gccmakedep-1.0.3-4.6.noarch.rpm"
RPM_HASH = "86019192477dec8e66a326f98c4615a34ca0baa39e579480b974103136d2097ea6e9ebaba39541af2e01800a0a8f3fe2dc53a8b5d1f36876ba5a60ea179d8149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gccmakedep"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
