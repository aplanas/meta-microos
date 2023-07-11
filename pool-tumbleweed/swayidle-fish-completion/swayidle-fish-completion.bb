SUMMARY = "Fish completion for swayidle"
DESCRIPTION = "Fish command line completion support for swayidle."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "swayidle-fish-completion-1.8.0-1.3.noarch.rpm"
RPM_HASH = "02485912dbd788f1213a4cb1aa109d03c0ce2ddee61c5da9efb24e4bef1ffb645b46d7c399deb61c70fc6c56d0ff8633b07f95b21188a9dfa1cd293f03fbe0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swayidle-fish-completion"

RDEPENDS:${PN} += "swayidle"

inherit rpm
