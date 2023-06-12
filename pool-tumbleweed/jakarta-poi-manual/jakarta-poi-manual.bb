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

RPM_NAME = "jakarta-poi-manual-2.5.1-31.6.noarch.rpm"
RPM_HASH = "13dcc4f28fb321d7e1439a2dcfa48896e9f631b602b55d48684a8b8fdc5d8c2322b2b70b8877b3ebe1d764684b93597e51ccfa847804ccb6c797b37ff08b3c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-poi-manual"
RDEPENDS:${PN} += ""

inherit rpm
