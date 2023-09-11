SUMMARY = "Documentation for libxml, an XML manipulation library"
DESCRIPTION = "The XML C library was initially developed for the GNOME project. It is \
now used by many programs to load and save extensible data structures \
or manipulate any kind of XML files."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "libxml2-doc-2.10.4-3.1.noarch.rpm"
RPM_HASH = "6f7bc3723f9a9f1b4a8e8387c13d20ed2d4f3a4ee30f112bb59e9d6e6ad12e6be7e4f235d3857c16f5583bd014e359310878c1daf4f24831f4f1ad5302fe94aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxml2-doc"

RDEPENDS:${PN} += "libxml2-2"

inherit rpm
