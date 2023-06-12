SUMMARY = "Python libraries mandatory for XML-XCB Development"
DESCRIPTION = "Language-independent Python libraries that used to parse an XML description \
and create objects used by Python code generators in individual language \
bindings."
LICENSE = "X11"

PV = "7.6_1.15.2"

RPM_NAME = "python3-xcb-proto-devel-7.6_1.15.2-2.1.aarch64.rpm"
RPM_HASH = "8e884fcc2d9744411929e18af33f73e8858bc3a8caf77d24bf4e7097701af648a1fbe8640041a4b8ac2ea69d5c9c0cdc20815d9d75c0715e0bdcdf6d2d797b6e"

RPROVIDES:${PN} += "python3-xcb-proto-devel \
python3-xcb-proto-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
