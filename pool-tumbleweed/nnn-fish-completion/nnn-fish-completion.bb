SUMMARY = "Fish Completion for nnn"
DESCRIPTION = "The official fish completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "4.9"

RPM_NAME = "nnn-fish-completion-4.9-1.1.noarch.rpm"
RPM_HASH = "23675b42a81d9be884b92ae35e80fd1271b606e7950cbb31ac13b040b1b38511415b0477adb4d9ce5d7bde08ca3c62c7e3b076bfb28ee0b3a98d6f219c9bfa98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
