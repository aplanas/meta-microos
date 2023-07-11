SUMMARY = "Library for Uniform Presentation of fvwm95 Programs"
DESCRIPTION = "This package contains a library for uniform presentation of fvwm95 \
programs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.9.2"

RPM_NAME = "xclass-0.9.2-188.7.aarch64.rpm"
RPM_HASH = "db5c72a1a73d96602ac142f6dd561db15855de88f7e180cabee03997d07d0d9b049cae15d657f1bdcc5d40ede41e28838378f77fe2ecc89316945b332cf3a0ea"

RPROVIDES:${PN} += "config-xclass \
xclass"

RDEPENDS:${PN} += ""

inherit rpm
