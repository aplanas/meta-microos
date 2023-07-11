SUMMARY = "Python libraries mandatory for XML-XCB Development"
DESCRIPTION = "Language-independent Python libraries that used to parse an XML description \
and create objects used by Python code generators in individual language \
bindings."
LICENSE = "X11"

PV = "7.6_1.15.2"

RPM_NAME = "python3-xcb-proto-devel-7.6_1.15.2-2.2.aarch64.rpm"
RPM_HASH = "e8955b7bc9d7a1feb54c535db14d4e42dfd9704c36b040c35e1eca942cd30ec00994733f7faf2855ee4f556f8e5ba92a24fb15148a35b010eb59c3ebae745880"

RPROVIDES:${PN} += "python3-xcb-proto-devel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
