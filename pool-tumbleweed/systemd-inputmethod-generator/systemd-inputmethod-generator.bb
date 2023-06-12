SUMMARY = "Expose INPUT_METHOD environment variable"
DESCRIPTION = "Expose INPUT_METHOD environment variable to user sessions \
according to the priority settings in /etc/X11/xim.d, so \
wayland sessions and systemd fcitx/ibus user services can \
work."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "systemd-inputmethod-generator-1.0.5-1.2.noarch.rpm"
RPM_HASH = "09d8fa53c6d7d4a4cba989769d63d76c57cad9d38b8160104ec52b0893977cef057821de7886c0e8eeb6f44df17025fde3fcbbc0abdebe96328084c484c35b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-inputmethod-generator"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
