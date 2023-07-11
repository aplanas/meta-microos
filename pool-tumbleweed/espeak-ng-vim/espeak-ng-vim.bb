SUMMARY = "Vim syntax highlighting for espeak-ng data files"
DESCRIPTION = "Optional files for syntax highlighting for espeak-ng data files in vim."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "espeak-ng-vim-1.51-1.9.noarch.rpm"
RPM_HASH = "edb18d7350b4997422940c99aefcc31f7dfccf8334380fcd0b75c7acb99ac1e16421e5189798583a14eb3acf412a87ff51d291eae42662363234726e701099c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "espeak-ng-vim"

RDEPENDS:${PN} += "espeak-ng"

inherit rpm
