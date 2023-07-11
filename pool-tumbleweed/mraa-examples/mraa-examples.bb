SUMMARY = "Examples for mraa"
DESCRIPTION = "libmraa is a C/C++ library with bindings to Java, Python and JavaScript to \
interface with the IO on Galileo, Edison & other platforms, with a \
structured API where port names/numbering matches the board that \
you are on. Use of libmraa does not tie you to specific hardware. With board \
detection done at runtime you can create portable code that will work \
across the supported platforms. \
 \
This package contains examples for mraa."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "mraa-examples-2.2.0-2.11.aarch64.rpm"
RPM_HASH = "6aed771f43fb392f3a04db4b05bf711e535d06aabe8d05ccb59abacb5acc7aec34fdbf36fd41d7c308eda565cc1e55d537f3e15d14650237d94734330843254e"

RPROVIDES:${PN} += "mraa-examples"

RDEPENDS:${PN} += ""

inherit rpm
