SUMMARY = "Fish completion for you-get"
DESCRIPTION = "Fish command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-fish-completion-0.4.1650-1.3.noarch.rpm"
RPM_HASH = "9a30e172880727699374d99a7ad52b1d0355e34324ba33387cf1cf04297ac59d5284a8e4af1999d2c4e086923afaa5df975f4105cefcf039643e0f21918eb944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
