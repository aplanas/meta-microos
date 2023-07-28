SUMMARY = "Battle for Wesnoth: Basic file system layout"
DESCRIPTION = "This package solely contains the basic file structure in order to have it owned by a package."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.17"

RPM_NAME = "wesnoth-fslayout-1.17.17-1.1.noarch.rpm"
RPM_HASH = "109be1c466b785b47caec5bd15ddae1dcafcba062276ea50384b2fe11b5386f402523cf4940e07d31352b11a2bc96dce5854267cb5419263994c14222ca8c540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wesnoth-fslayout"

RDEPENDS:${PN} += ""

inherit rpm
