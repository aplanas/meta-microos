SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with huge numbers (integer and floating point)."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-gmp-devel-6.1.1-3.11.noarch.rpm"
RPM_HASH = "9763f6db40edc38cd6a13decebf2cfc2a24e56ce11d334217f95cdf9cba8b71283b9b2a5d120d4300b914f2b63c04a66ca57e6144a0fda97c5fc6fbd8dc9629d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gmp-devel \
mingw64-lib-gmp \
mingw64-lib-gmpxx"

RDEPENDS:${PN} += "mingw64-libgmp10 \
mingw64-libgmpxx"

inherit rpm
