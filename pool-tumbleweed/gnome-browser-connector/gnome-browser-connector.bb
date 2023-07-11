SUMMARY = "GNOME Shell integration for Chrome Extension compatible browsers"
DESCRIPTION = "Browser extension for Google Chrome/Chromium, Firefox, Vivaldi, Opera (and other \
Browser Extension, Chrome Extension or WebExtensions capable browsers) and native \
host messaging connector that provides integration with GNOME Shell and the \
corresponding extensions repository https://extensions.gnome.org."
LICENSE = "GPL-3.0-or-later"

PV = "42.1"

RPM_NAME = "gnome-browser-connector-42.1-2.3.aarch64.rpm"
RPM_HASH = "61d83b965e9ecc4eafa1b62ab3b898af4939353c0c0cf304ef2969c16a63cd84e032aacfcb944d3e70929f398d5b954f0cc3b3cb3b2eb63c1f06a3bfe9851cf2"

RPROVIDES:${PN} += "chrome-gnome-shell \
config-gnome-browser-connector \
gnome-browser-connector"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
