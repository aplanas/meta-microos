SUMMARY = "Configuration for the Alpine mail client"
DESCRIPTION = "The package provides a system-wide configuration file for the Alpine \
text/ncurses mail client. This enables some features that would \
otherwise be disabled by default, including threading, additional \
keybindings, color, threading."
LICENSE = "WTFPL"

PV = "0"

RPM_NAME = "alpine-branding-openSUSE-0-5.17.noarch.rpm"
RPM_HASH = "4775e71dee174e208f2f299f400cf0b852fc1aab8cf899d9392e1cf32ef0f1159037c63e19991e37cac1d2d983879ace4feeed1e251a8f8de5450ffd4460f9ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alpine-branding \
alpine-branding-openSUSE \
config-alpine-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
