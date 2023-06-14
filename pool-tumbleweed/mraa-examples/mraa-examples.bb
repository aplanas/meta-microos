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

RPM_NAME = "mraa-examples-2.2.0-2.10.aarch64.rpm"
RPM_HASH = "2a929bd92a36db0d6bb01d7d07df44a9611f21bb13a4f4cdd0329fcafe5f3342c4fe604d460f852aec59b0fe3d975a9d2903708eddf55d2040ad491c414117d7"

RPROVIDES:${PN} += "mraa-examples"

RDEPENDS:${PN} += ""

inherit rpm
