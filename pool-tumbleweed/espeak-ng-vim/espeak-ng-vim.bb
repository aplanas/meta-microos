SUMMARY = "Vim syntax highlighting for espeak-ng data files"
DESCRIPTION = "Optional files for syntax highlighting for espeak-ng data files in vim."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "espeak-ng-vim-1.51-1.8.noarch.rpm"
RPM_HASH = "1a9470fc6542095f2feb7c0c8c87fbaf43ebee33ca263fdfd5e15c2217af1fe1c5879bb14db4a12bda7d35ee3466d0815321b0e8f711adc5ee0fea83475a35ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "espeak-ng-vim"

RDEPENDS:${PN} += "espeak-ng"

inherit rpm
