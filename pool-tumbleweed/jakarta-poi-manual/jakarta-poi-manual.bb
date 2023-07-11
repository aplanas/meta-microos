SUMMARY = "Java API To Access Microsoft Format Files"
DESCRIPTION = "The POI project consists of APIs for manipulating various file formats \
based upon Microsoft's OLE 2 Compound Document format using pure Java. \
In short, you can read and write MS Excel files using Java. Soon, \
you'll be able to read and write Word files using Java. POI is your \
Java Excel solution as well as your Java Word solution. However, we \
have a complete API for porting other OLE 2 Compound Document formats \
and welcome others to participate. OLE 2 Compound Document Format based \
files include most Microsoft Office files such as XLS and DOC as well \
as MFC serialization API based file formats."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "jakarta-poi-manual-2.5.1-31.7.noarch.rpm"
RPM_HASH = "725524e6e661c625265461626d3f1b2c16d1540c53755ff53bd9611dc56bc2d714ff4c0ae606b929a2a6e0da5ebc912d2456e68e00d07ee4495008d43e83aca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-poi-manual"

RDEPENDS:${PN} += ""

inherit rpm
