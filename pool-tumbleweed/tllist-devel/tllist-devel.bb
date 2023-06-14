SUMMARY = "A C header file only implementation of a typed linked list"
DESCRIPTION = "tllist is a Typed Linked List C header file only library implemented using pre-processor macros."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tllist-devel-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "28850a1e7062e0247c2824ed909282182d5d9d41a48d8efb946d8e55ac29669ab4bd05f64c4c74e44e9f1a99e4c5d8fe8ef53817b4c7941d46899bc8f4e34473"

RPROVIDES:${PN} += "pkgconfig-tllist \
tllist-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
