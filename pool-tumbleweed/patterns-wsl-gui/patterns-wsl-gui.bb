SUMMARY = "WSL GUI packages"
DESCRIPTION = "This package contains the wsl_gui pattern: recommended configs,tools,libraries for using WSLg."
LICENSE = "MIT"

PV = "20221221"

RPM_NAME = "patterns-wsl-gui-20221221-1.2.noarch.rpm"
RPM_HASH = "abaf7915d706d98b871901b301be76241882a9a36f1fb8384a714439bcf5ae197e43a0ca48b18e792c7f1d4396bb84f8a93e1a76412f355c2c1c924aa6a0bfdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-visible() \
patterns-wsl-gui"

RDEPENDS:${PN} += "/bin/sh \
lato-fonts"

inherit rpm
