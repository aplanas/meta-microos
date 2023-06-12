SUMMARY = "Development files for keybinder-3.0"
DESCRIPTION = "This package contains the development files for keybinder-3.0."
LICENSE = "MIT & X11"

PV = "0.3.2"

RPM_NAME = "keybinder-3.0-devel-0.3.2-1.25.aarch64.rpm"
RPM_HASH = "26f355be4d017e77130b588e3b38a7836096c06aa786ff12ac0dc70096d730655fb6961ea2aad3a19ed981ed82adff68c9df1d41dcea8989ab896b9fcbf426fc"

RPROVIDES:${PN} += "keybinder-3.0-devel \
keybinder-3.0-devel(aarch-64) \
pkgconfig(keybinder-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkeybinder-3_0-0 \
pkgconfig \
pkgconfig(gtk+-3.0)"

inherit rpm
