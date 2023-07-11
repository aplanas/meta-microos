SUMMARY = "Development files for mraa"
DESCRIPTION = "libmraa is a C/C++ library with bindings to Java, Python and JavaScript to \
interface with the IO on Galileo, Edison & other platforms, with a \
structured API where port names/numbering matches the board that \
you are on. Use of libmraa does not tie you to specific hardware. With board \
detection done at runtime, you can create portable code that will work \
across the supported platforms. \
 \
This package contains development files for mraa."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "mraa-devel-2.2.0-2.11.aarch64.rpm"
RPM_HASH = "047f8119b007dfb4af670995530f3ce196dff5a6127710e66024971d55405c2a8fd8af61b675f7144e7f569935cbcda6b607bc27db48cb9735b0d175415f6933"

RPROVIDES:${PN} += "mraa-devel \
pkgconfig-mraa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmraa2"

inherit rpm
