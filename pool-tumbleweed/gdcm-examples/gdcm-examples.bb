SUMMARY = "GDCM examples"
DESCRIPTION = "CSharp, C++, Java, PHP and Python example programs for GDCM."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-examples-3.0.21-1.5.aarch64.rpm"
RPM_HASH = "4c792bfcacea49d8bb36a8351f5531853a8ae463ea0ca5e21b8a56fda395273ae69f376943220d6be4931c0a92a07715af8936b5d8c3bd78a113322a10da2ab8"

RPROVIDES:${PN} += "gdcm-examples"

RDEPENDS:${PN} += "libgdcm3-0"

inherit rpm
