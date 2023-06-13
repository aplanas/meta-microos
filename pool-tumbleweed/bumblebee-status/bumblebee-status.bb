SUMMARY = "Modular, theme-able status line generator for the i3 window manager"
DESCRIPTION = "bumblebee-status is a modular, themeable status line generator for the i3 window manager. \
It supports theming and does not require any configuration files. \
 \
You can use the mouse wheel up/down to switch workspaces forward and back everywhere throughout the bar."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-2.1.5-3.3.aarch64.rpm"
RPM_HASH = "5f58f7e6fc733f6985552182c887d7492136e9a9737bd70f5052312c1360cee07eb926b39221e4e3ae9db1ae63316584dbd505ed8c5b41d13dfc841103426d8c"

RPROVIDES:${PN} += "bumblebee-status \
bumblebee-status(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1 \
i3 \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
psmisc \
python3 \
python3-dbus-python \
python3-netifaces \
python3-power \
python3-psutil \
python3-pytz \
python3-requests \
python3-tzlocal \
sudo \
xdg-utils"

inherit rpm
