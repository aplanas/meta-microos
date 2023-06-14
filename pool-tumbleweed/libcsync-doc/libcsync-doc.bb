SUMMARY = "User documentation for csync"
DESCRIPTION = "The libcsync-doc package provides user documentation for csync."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-doc-0.50.0-11.9.aarch64.rpm"
RPM_HASH = "a9b676eaaf94ebfa73c817cb8980b4449771e11f04f4fb4e0d43f0c5e8c8ccf6b35513e1d97b1aaa6b6391c333ebc9b773e06e57a10a40a326f11e22be39655e"

RPROVIDES:${PN} += "libcsync-doc"

RDEPENDS:${PN} += ""

inherit rpm
