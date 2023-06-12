SUMMARY = "Light theme for LXQt"
DESCRIPTION = "openSUSE-light for LXQt lightweight Qt desktop environment"
LICENSE = "CC-BY-SA-4.0"

PV = "0.1"

RPM_NAME = "lxqt-theme-openSUSE-light-0.1-2.14.noarch.rpm"
RPM_HASH = "5a1fe87663207398c0a34eefb0ba69988e0da68f61348b37c85e37e34ac66d0dae1eba61b14d0abbea7e851c080965986dd826ca3753b706d8e236a91fe35dc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-theme-openSUSE-light"
RDEPENDS:${PN} += "lxqt-themes"

inherit rpm
