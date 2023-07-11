SUMMARY = "ZSH completion for khal"
DESCRIPTION = "zsh shell completions for khal"
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python-khal-zsh-completion-0.10.5-3.5.noarch.rpm"
RPM_HASH = "816986781c9216487242a4d9e906747d21df08a8c477d852214323a2df944ce92b8af18740ffdf31ad28bb11cbf1cd43c10032b52b3161cd937dd07c25e344c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-khal-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
