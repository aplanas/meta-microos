SUMMARY = "This package provides a set of default configurations for LXDE"
DESCRIPTION = "Lxde-common package provides a set of default configurations for LXDE. \
It's an LXDE core package, since without it LXDE cannot run."
LICENSE = "GPL-2.0"

PV = "0.99.2"

RPM_NAME = "lxde-common-0.99.2-2.17.noarch.rpm"
RPM_HASH = "c7f6deda7cb9ad664f683341896d480e72f210e9da52cd7b26b863a481defebc79031efecb29a35c2dd687f64917bd2b02b3be9244b03eb516f5e9105fb8cd98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxde-common \
lxde-settings-daemon"

RDEPENDS:${PN} += "/bin/sh \
lxde-common-branding \
update-alternatives"

inherit rpm
