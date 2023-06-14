SUMMARY = "Avocado Plugin for Execution of GLib Test Framework tests"
DESCRIPTION = "This optional plugin is intended to list and run tests written in the \
GLib Test Framework."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-glib-69.0-6.10.noarch.rpm"
RPM_HASH = "c1b3b18d0c44c712dcacc2c4f92b9ad997bcf3f1916631c879bec29af6eaa914855b3c402f62ea2a0235cf958571968443716e07345ee5a61a5e6627e78f17d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-glib \
python3.10dist-avocado-framework-plugin-glib \
python3dist-avocado-framework-plugin-glib"

RDEPENDS:${PN} += "python-abi \
python3-avocado"

inherit rpm
