SUMMARY = "Documentation for rttr"
DESCRIPTION = "API Documentation for rttr"
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "rttr-devel-doc-0.9.6-4.16.aarch64.rpm"
RPM_HASH = "713dd593bd55d8b51a49f6b0a85c67a968389dc4d2a33015b3adc8196373f1fe6ee4b467560a39835440af8660d05140517569e97db7356c963077d3c803de52"

RPROVIDES:${PN} += "rttr-devel-doc \
rttr-devel-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
