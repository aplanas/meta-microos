SUMMARY = "DTD and Stylesheets for Web Site Development"
DESCRIPTION = "A DTD in XML as an extension to DocBook XML and XSL stylesheets to \
process it."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "docbook-xml-website-2.6.0-82.16.noarch.rpm"
RPM_HASH = "0b6544a61ddb443d96677fb3583f302f0a9ef15b2140633024c69850bdc0fb316e8aa91c666de721b155179dc0193f3f0408835aa359fadfdf4ce74c28e828fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-docbook-xml-website \
docbook-xml-website"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/edit-xml-catalog \
/usr/bin/sgml-register-catalog \
/usr/bin/xmlcatalog \
awk \
docbook-4 \
docbook-xsl-stylesheets \
grep \
sed \
sgml-skel \
xmlcharent"

inherit rpm
