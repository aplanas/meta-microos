SUMMARY = "A RGB/HSV color selector"
DESCRIPTION = "A simple interactive RGB/HSV color selector modelled after Gimp2 RGB/HSV color \
selector."
LICENSE = "SUSE-Public-Domain"

PV = "20110107"

RPM_NAME = "vim-plugin-colorsel-20110107-56.1.noarch.rpm"
RPM_HASH = "b6e46140414a7867bc74fc659ae710b28aec8273d3b87250a9dee747c442b790e7bd29f6a8d99b7b04df9d839eb18272bea5156e40e9517ca27dbe7c2281934e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-colorsel"

RDEPENDS:${PN} += "/usr/bin/sh \
gvim \
vim"

inherit rpm
