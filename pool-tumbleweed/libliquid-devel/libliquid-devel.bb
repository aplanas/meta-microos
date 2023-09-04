SUMMARY = "Development files for the liquid-dsp library"
DESCRIPTION = "liquid-dsp is a signal processing library for software-defined \
radios written in C. Its purpose is to provide a set of extensible DSP modules \
that do no rely on external dependencies or cumbersome frameworks. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libliquid."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libliquid-devel-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "4d28dbd549dd0fe5fbf02cfb5a458ced8303b1cace6e6d1b028ebad327ce3e4805d4c7b3f1daf556e7f7744b8206de216bf8c56b4284e53ef05e0b0002b5d5b0"

RPROVIDES:${PN} += "libliquid-devel"

RDEPENDS:${PN} += "libliquid"

inherit rpm
