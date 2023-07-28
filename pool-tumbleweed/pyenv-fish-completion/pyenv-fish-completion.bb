SUMMARY = "Fish completion for pyenv"
DESCRIPTION = "Fish command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.22"

RPM_NAME = "pyenv-fish-completion-2.3.22-1.1.noarch.rpm"
RPM_HASH = "2630956c2fe801cf957d374108fd433004b4928d0052f79dda19a5db6881bcf6be5aa0b238b7b4329ef994c8c4fd13356fb7b62354dac3b864d0713113c49a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyenv-fish-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
