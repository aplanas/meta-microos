SUMMARY = "DocBook XML Slides"
DESCRIPTION = "A framework for writing slides using the DocBook DTD."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "docbook-xml-slides-3.3.1-220.16.noarch.rpm"
RPM_HASH = "4c7b848519bb7cb16779178a628ab859e276eae2165e7195fb866b3b6acd20199676f668fe7d9f0d9daea26a63ed549db45cd1270adb15f9f7c6c33f5a429124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(docbook-xml-slides) \
docbook-xml-slides"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/edit-xml-catalog \
/usr/bin/sgml-register-catalog \
/usr/bin/xmlcatalog \
awk \
docbook-xsl-stylesheets \
docbook_4 \
grep \
sed \
xmlcharent"

inherit rpm
