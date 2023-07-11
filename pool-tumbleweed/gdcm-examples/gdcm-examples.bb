SUMMARY = "GDCM examples"
DESCRIPTION = "CSharp, C++, Java, PHP and Python example programs for GDCM."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-examples-3.0.21-1.8.aarch64.rpm"
RPM_HASH = "c645ffbd51a5813120caf9375d8dd8ced50e507f5682a68249a2d9114bc77092c9e90dba2ac8a49969a97147c78df5517173c548bf2ad4bcf2d419d7e05590b7"

RPROVIDES:${PN} += "gdcm-examples"

RDEPENDS:${PN} += "libgdcm3-0"

inherit rpm
