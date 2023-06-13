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

RPM_NAME = "mraa-devel-2.2.0-2.10.aarch64.rpm"
RPM_HASH = "afa1d28220372ccd9bd6271d8e498d5fb65e514c635063509a363ee90ebc0cc3fa93400c74ed813f1d3e3754dc895d3cdfe73db34f06f956dd6aeb988ac9d14a"

RPROVIDES:${PN} += "mraa-devel \
mraa-devel(aarch-64) \
pkgconfig(mraa)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmraa2"

inherit rpm
