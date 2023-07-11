SUMMARY = "Development Files for tdom"
DESCRIPTION = "This package contains files for developing software based on tdom."
LICENSE = "MPL-2.0"

PV = "0.9.3"

RPM_NAME = "tdom-devel-0.9.3-1.1.aarch64.rpm"
RPM_HASH = "1b90113b7573f39374d185c1a371ab507f09221975f11b65222b3f6d661643101b5f0764b0cbfb6ed618bda822a33002c1e9c7402665bbe7f24620e4043a2e37"

RPROVIDES:${PN} += "tdom-devel"

RDEPENDS:${PN} += "tcl-devel \
tdom"

inherit rpm
