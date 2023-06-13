SUMMARY = "Theme for LXQt"
DESCRIPTION = "openSUSE-default for LXQt lightweight Qt desktop environment"
LICENSE = "CC-BY-SA-4.0"

PV = "0.1"

RPM_NAME = "lxqt-theme-openSUSE-default-0.1-2.14.noarch.rpm"
RPM_HASH = "30afaab0382b7d09f484bb249a97d773b0a02d791a868634e37cb18e99085f9be61e80e6e03f2cad9daf77ffbd439ac8215a84504cdbf52133312d27cf472286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-theme-openSUSE-default"

RDEPENDS:${PN} += "lxqt-themes"

inherit rpm
