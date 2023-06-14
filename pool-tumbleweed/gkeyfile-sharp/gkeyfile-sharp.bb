SUMMARY = ".NET/C# Bindings for GKeyFile"
DESCRIPTION = "C#/CLI bindings for GKeyFile"
LICENSE = "LGPL-2.1"

PV = "0.2"

RPM_NAME = "gkeyfile-sharp-0.2-18.21.aarch64.rpm"
RPM_HASH = "165971e68ef3a15c27ada04c8930ba82a084ec01646ba7119067693ca2c79da60d61e08fab214db8858fa136179da6be2214ee5d57c26d96b87559f708417102"

RPROVIDES:${PN} += "gkeyfile-sharp \
mono-gkeyfile-sharp"

RDEPENDS:${PN} += "glib-sharp2 \
mono-core \
mono-glib-sharp \
mono-mscorlib"

inherit rpm
