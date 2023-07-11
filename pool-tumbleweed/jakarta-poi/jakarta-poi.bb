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

RPM_NAME = "jakarta-poi-2.5.1-31.7.noarch.rpm"
RPM_HASH = "fd6dd59f7e40857ef2a56d6f0edf7a18a0c3e976dec776b8f703f3b9253711c5cb8bffbd24e0117092f94232359d1277167e0b3b95c1813073f7c4fce15aaa24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-poi"

RDEPENDS:${PN} += "jakarta-commons-beanutils \
jakarta-commons-collections \
jakarta-commons-lang \
jakarta-commons-logging \
reload4j \
xalan-j2 \
xerces-j2"

inherit rpm
