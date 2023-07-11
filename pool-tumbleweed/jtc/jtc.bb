SUMMARY = "JSON processing utility"
DESCRIPTION = "jtc stand for: JSON transformational chains (used to be JSON test console). \
 \
jtc offers a powerful way to select one or multiple elements from a source JSON \
and apply various actions on the selected elements at once (wrap selected \
elements into a new JSON, filter in/out, sort elements, update elements, insert \
new elements, remove, copy, move, compare, transform, swap around and many other \
operations)."
LICENSE = "MIT"

PV = "1.76d"

RPM_NAME = "jtc-1.76d-1.14.aarch64.rpm"
RPM_HASH = "f94be678dfda9f90ba19b7bb34f2017b90e4ebeb2775cc67cca9ecbc287956556d39a515f44962ed4fc3231fdeea3b595d3654eeb1868cc35009aa2befa35c19"

RPROVIDES:${PN} += "jtc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
