SUMMARY = "GTK key theme that sets ctrl-u in text entries"
DESCRIPTION = "A GTK key theme that makes ctrl-u, ctrl-w and ctrl-h work in text \
entries and text views. In contrast to the Emacs key theme which \
redefines many other common key bindings (like ctrl-p) this is \
one is reduced to the bare minimum to make text entries usable."
LICENSE = "GPL-2.0+"

PV = "1"

RPM_NAME = "gtk-key-theme-ctrluftw-1-12.16.noarch.rpm"
RPM_HASH = "8c1dc21c24aafcd7ed957ff52f13834394babd57579f4e7e9e62979dab04040ae527fb2bfb8bdf5da6937b3aa19b97b0e4a62c325128d551c791b3d83e518a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk-key-theme-ctrluftw"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
