SUMMARY = "Nested JSON data to tabular data transformer"
DESCRIPTION = "Jt reads UTF-8 encoded JSON forms from stdin and writes tab separated \
values (or CSV) to stdout. A simple stack-based programming language \
is used to extract values from the JSON input for printing."
LICENSE = "EPL-1.0"

PV = "4.3.3"

RPM_NAME = "json-table-4.3.3-2.14.aarch64.rpm"
RPM_HASH = "34f5813f34a26ccbaae918aaaab147acab2aacfce716fcefd6b8417b7edc74522a87ccc22bbf39de49ebf301241ff85bae23261e8ef84ef6daeed7c4ab9e4532"

RPROVIDES:${PN} += "json-table"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
