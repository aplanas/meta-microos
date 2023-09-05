SUMMARY = "Development files for the liquid-dsp library"
DESCRIPTION = "liquid-dsp is a signal processing library for software-defined \
radios written in C. Its purpose is to provide a set of extensible DSP modules \
that do no rely on external dependencies or cumbersome frameworks. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libliquid."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libliquid-devel-1.6.0-2.1.aarch64.rpm"
RPM_HASH = "5ffc56ecfeeb3a1cc6357226ded1e68b87965c7915c5469da1f2fe4c7978cb332409febb828d2fc8267e45b5ac806045b890570dbccb9d4e3d7741f99700a57b"

RPROVIDES:${PN} += "libliquid-devel"

RDEPENDS:${PN} += "libliquid"

inherit rpm
