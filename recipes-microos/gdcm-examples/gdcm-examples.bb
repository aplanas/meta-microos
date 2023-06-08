SUMMARY = "GDCM examples"
DESCRIPTION = "CSharp, C++, Java, PHP and Python example programs for GDCM."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-examples-3.0.21-1.4.aarch64.rpm"
RPM_HASH = "a971308192d4b0e1edfa442d72c87a44dcaafce5825d18703430e435361016b4378647a6d586ecd93213f10ef93e72d7b32ef1892abcc01b88e949a3bffb3bc6"

RPROVIDES:${PN} += "gdcm-examples gdcm-examples(aarch-64)"
RDEPENDS:${PN} += "libgdcm3_0"

inherit rpm
