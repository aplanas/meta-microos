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

RPM_NAME = "jakarta-poi-javadoc-2.5.1-31.6.noarch.rpm"
RPM_HASH = "26f6037808ed877255d925c8fef645fbb20a42b08d0e541ee4634cf808c220983e674fd233d250a5122fc65cc11a565ba8fa9bf6a5eb4402b9db34a149aec8ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-poi-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
