SUMMARY = "User documentation for csync"
DESCRIPTION = "The libcsync-doc package provides user documentation for csync."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-doc-0.50.0-11.10.aarch64.rpm"
RPM_HASH = "8aa9528df3b4c6e58faa193dd0ef2c1c091b445c1154e81c55c8933f9b0c70c3df944efec152bc1faeaebbbb9be50a77591fba75d718bc8571aed1d3fd9187ce"

RPROVIDES:${PN} += "libcsync-doc"

RDEPENDS:${PN} += ""

inherit rpm
