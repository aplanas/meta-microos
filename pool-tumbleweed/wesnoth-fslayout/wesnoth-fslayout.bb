SUMMARY = "Battle for Wesnoth: Basic file system layout"
DESCRIPTION = "This package solely contains the basic file structure in order to have it owned by a package."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.16"

RPM_NAME = "wesnoth-fslayout-1.17.16-1.2.noarch.rpm"
RPM_HASH = "fdccf0afa91fac9fe54dd0e08185b04a2d4e2c5a647dfee76f78589311247cb529996403e7c2197c413866e1227bb7075668606184ca54d8021e5151458cc8de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wesnoth-fslayout"

RDEPENDS:${PN} += ""

inherit rpm
