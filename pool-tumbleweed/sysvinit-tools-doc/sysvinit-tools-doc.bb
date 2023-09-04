SUMMARY = "Documentation of tools for basic booting"
DESCRIPTION = "Documentation of helper tools from sysvinit that support booting, including but not exclusive \
to startpar and killproc."
LICENSE = "GPL-2.0-or-later"

PV = "3.08"

RPM_NAME = "sysvinit-tools-doc-3.08-1.1.noarch.rpm"
RPM_HASH = "8525ad1cd25481bc84da598cead0134ad65eaeccea4a6ad8a265fc029c9e0751b2d90e30690f72200fa6543c278c429987e0b55ab2da1e0ca5ca71e36e755f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sysvinit-tools-doc"

RDEPENDS:${PN} += "sysvinit-tools"

inherit rpm
