SUMMARY = "Expose INPUT_METHOD environment variable"
DESCRIPTION = "Expose INPUT_METHOD environment variable to user sessions \
according to the priority settings in /etc/X11/xim.d, so \
wayland sessions and systemd fcitx/ibus user services can \
work."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "systemd-inputmethod-generator-1.0.5-1.3.noarch.rpm"
RPM_HASH = "937c20bf93a086a7dffda4d86b11999b1ee3749e271db13bb2cb43b873636763daa21869547bf934970b95e01f18f90b8630e450ed96014aa7cd56c55260abe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-inputmethod-generator"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
