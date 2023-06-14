SUMMARY = "Tools to transform EOT font files into other formats"
DESCRIPTION = "Tools to transform EOT font files into other formats. Only TTF is \
supported currently."
LICENSE = "MPL-2.0"

PV = "0.01"

RPM_NAME = "libeot-tools-0.01-1.27.aarch64.rpm"
RPM_HASH = "31d7b1ff285e1365cd378713b0567913569342e253f7a5fe0ab06f52d192fc14da660776cbe6de60a969b39c09440a2d30d4a242729cf36f2c8524353e0b98ef"

RPROVIDES:${PN} += "libeot-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeot.so.0"

inherit rpm
