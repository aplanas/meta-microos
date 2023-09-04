SUMMARY = "Tools to work with PDF files"
DESCRIPTION = "Command line tools for working with PDF files."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "podofo-0.10.1-1.1.aarch64.rpm"
RPM_HASH = "c6ad5c01afdc37645085bd949b6f813794fd9853c746a93a7f4eaf008e620e6c120767d8230cdbfc800f876a68632c884476608eeecdb7f3864a0e836aa1beaa"

RPROVIDES:${PN} += "podofo"

RDEPENDS:${PN} += ""

inherit rpm
