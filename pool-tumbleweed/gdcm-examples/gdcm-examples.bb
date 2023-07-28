SUMMARY = "GDCM examples"
DESCRIPTION = "CSharp, C++, Java, PHP and Python example programs for GDCM."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-examples-3.0.21-1.9.aarch64.rpm"
RPM_HASH = "e361b3235f2afd88a81f599be708b72c2928ca53b8af47738a5bfcf0501eea0938515cd28bf01a5a6948d3d4db62b50b35fcf91cbf57c3904ce777559b899a6c"

RPROVIDES:${PN} += "gdcm-examples"

RDEPENDS:${PN} += "libgdcm3-0"

inherit rpm
