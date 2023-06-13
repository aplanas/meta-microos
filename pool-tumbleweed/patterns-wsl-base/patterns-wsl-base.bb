SUMMARY = "Base WSL packages"
DESCRIPTION = "This package contains the wsl_base pattern: recommended configs,tools,libraries for using WSL."
LICENSE = "MIT"

PV = "20221221"

RPM_NAME = "patterns-wsl-base-20221221-1.2.noarch.rpm"
RPM_HASH = "b22e23e5bc441f16024c40db69b910ffc2ba80e34727f52d31665bbd7534be4943e70d1ccf678e0ac35e772a1a1bd744b85d93caef258dc9dfd26273d89e616d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-visible() \
patterns-wsl-base"

RDEPENDS:${PN} += "/bin/sh \
bash"

inherit rpm
