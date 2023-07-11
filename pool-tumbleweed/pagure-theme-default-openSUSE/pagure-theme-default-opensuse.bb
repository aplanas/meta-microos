SUMMARY = "Configuration for pagure to default to the openSUSE web interface theme"
DESCRIPTION = "This package sets the default web interface assets used for \
a Pagure server running on openSUSE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-default-openSUSE-5.13.3-1.5.noarch.rpm"
RPM_HASH = "2cad37c8d2ea7f16c4479931526d640e191b87ae5b1ffe2a52cb1aad3e965b54ffe7a434bdf5721b6b7ed0d48a05613636cd06eabd38152da6a2645a15f2dcb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-default \
pagure-theme-default-openSUSE"

RDEPENDS:${PN} += "pagure-theme-chameleon"

inherit rpm
