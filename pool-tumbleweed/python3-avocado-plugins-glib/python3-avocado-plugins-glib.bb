SUMMARY = "Avocado Plugin for Execution of GLib Test Framework tests"
DESCRIPTION = "This optional plugin is intended to list and run tests written in the \
GLib Test Framework."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-glib-69.0-6.11.noarch.rpm"
RPM_HASH = "e41995fefa602ebc206aed84f0245aca398d1b723c369dd85cb199cd27bf2dba7be95a239f7826db3c5fc26377f23762114ac798b8e77039f41c479b6e2e7eee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-glib \
python3.11dist-avocado-framework-plugin-glib \
python3dist-avocado-framework-plugin-glib"

RDEPENDS:${PN} += "python-abi \
python3-avocado"

inherit rpm
