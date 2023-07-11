SUMMARY = "KDE PIM libraries MIME support"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kmime-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e7be7aa9edde07381a5a35a0c50bd5033aa3adbdd2ff46cb4432380a89a63991731b7b029bc513aed232d724b2ec84a358064f7efe0272ff7a1c0a6ad15ba583"

RPROVIDES:${PN} += "kmime"

RDEPENDS:${PN} += ""

inherit rpm
