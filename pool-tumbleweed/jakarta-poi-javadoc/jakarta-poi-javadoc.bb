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

RPM_NAME = "jakarta-poi-javadoc-2.5.1-31.7.noarch.rpm"
RPM_HASH = "8cd4770c91250bedb9f8cde20d809767002ccbcae7e28b2f4c8be655dede7c9dc83cbfd6ce460bd92be0eba92a6ae94167c1ee69ad37082f8e780312e4ed0bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-poi-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
