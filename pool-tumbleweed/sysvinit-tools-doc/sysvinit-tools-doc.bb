SUMMARY = "Documentation of tools for basic booting"
DESCRIPTION = "Documentation of helper tools from sysvinit that support booting, including but not exclusive \
to startpar and killproc."
LICENSE = "GPL-2.0-or-later"

PV = "3.07"

RPM_NAME = "sysvinit-tools-doc-3.07-1.1.noarch.rpm"
RPM_HASH = "5919f7d330844fcabbb0f4a932e9f79c215e0ec82547ef86eeb7bf6486738f32656ba4aaa23e08ccb6caa5e5037617e3c7e5901651d6e3e4bfdbee206c60a2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sysvinit-tools-doc"
RDEPENDS:${PN} += "sysvinit-tools"

inherit rpm
