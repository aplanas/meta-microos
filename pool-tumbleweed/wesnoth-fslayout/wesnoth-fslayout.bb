SUMMARY = "Battle for Wesnoth: Basic file system layout"
DESCRIPTION = "This package solely contains the basic file structure in order to have it owned by a package."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.16"

RPM_NAME = "wesnoth-fslayout-1.17.16-1.1.noarch.rpm"
RPM_HASH = "d55f3298f04f9b5e7d56585eb279f71819c4d838aabc569058bffc503e9129031686d88a1205b3c371c8e0adf38c668d76318ccad47f578dec22822b08a30bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wesnoth-fslayout"
RDEPENDS:${PN} += ""

inherit rpm
