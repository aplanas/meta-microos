SUMMARY = "Fish Completion for hyperfine"
DESCRIPTION = "The official fish completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.16.1"

RPM_NAME = "hyperfine-fish-completion-1.16.1-1.1.noarch.rpm"
RPM_HASH = "f3aca469d16b9349d938ceb4853da3352aca2ef4bd248d366ba393b198efea0b3c2bfc8d01db982b96ba7dc8c523d4b8f1dc99e2d28af44045dde9bcd1db5ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
