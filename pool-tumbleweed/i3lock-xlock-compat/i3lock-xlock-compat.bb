SUMMARY = "Xlock-compatibility script which calls i3lock"
DESCRIPTION = "This package provides a script /usr/bin/xlock which calls i3lock to lock your screen. \
This is handy for hard-coded screen-saver invocations e.g. in XFCE4, so you can use \
i3lock instead of xlock with them."
LICENSE = "BSD-3-Clause"

PV = "2.14.1"

RPM_NAME = "i3lock-xlock-compat-2.14.1-1.1.aarch64.rpm"
RPM_HASH = "cc6d9288d71e1f42163794927bfeb96b931f1a2c2a92d4c79449757fe2694e0abe2b34eae1d27dd1820d24e4836b63aa4f21c5e0dd6869bfa24c52a1ca0e9696"

RPROVIDES:${PN} += "i3lock-xlock-compat"

RDEPENDS:${PN} += "/usr/bin/bash \
ImageMagick \
xdpyinfo"

inherit rpm
