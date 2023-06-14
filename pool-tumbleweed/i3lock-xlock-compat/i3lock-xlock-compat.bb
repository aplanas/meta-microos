SUMMARY = "Xlock-compatibility script which calls i3lock"
DESCRIPTION = "This package provides a script /usr/bin/xlock which calls i3lock to lock your screen. \
This is handy for hard-coded screen-saver invocations e.g. in XFCE4, so you can use \
i3lock instead of xlock with them."
LICENSE = "BSD-3-Clause"

PV = "2.13"

RPM_NAME = "i3lock-xlock-compat-2.13-2.3.aarch64.rpm"
RPM_HASH = "3defe5bf4510e2ef0665c2c62b7cb9e79f298cd0081761dcb2a3a8f274142077979e459139c030fbc0a3e208decb6d5ffbb3d38821a26ef74766f9be2ef9e3f9"

RPROVIDES:${PN} += "i3lock-xlock-compat"

RDEPENDS:${PN} += "/bin/bash \
ImageMagick \
xdpyinfo"

inherit rpm
