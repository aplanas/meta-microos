SUMMARY = "Draft Diff Tool"
DESCRIPTION = "The purpose of this program is to compare two versions of an \
Internet Draft, and as output produce a diff in one of several \
formats: \
- side-by-side HTML diff \
- paged wdiff output in a text terminal \
- a text file with changebars in the left margin \
- a simple unified diff output"
LICENSE = "GPL-2.0-or-later"

PV = "1.47"

RPM_NAME = "rfcdiff-1.47-1.10.noarch.rpm"
RPM_HASH = "a51c6ee225eeb4f6d73003fde4927a639340bade6ecaee653360a8e4a65ec93e158596728d742aec1673fae6bc096500c3f096a3e2ec08ff6ae223902a76ef04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rfcdiff"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
