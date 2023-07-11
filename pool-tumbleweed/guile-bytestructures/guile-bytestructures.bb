SUMMARY = "Bytestructures for Guile"
DESCRIPTION = "This library offers a system imitating the type system of the C programming \
language, to be used on bytevectors within Guile."
LICENSE = "GPL-3.0-only"

PV = "1.0.10"

RPM_NAME = "guile-bytestructures-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "8f7407a0d920396ea0f19c43e918e327e7fb0a59cf11722a9056816eed951fb3bb3525c1c3b59b6f41142cf9dce65973f4d723da74b08caae671f1dc271607b1"

RPROVIDES:${PN} += "guile-bytestructures"

RDEPENDS:${PN} += "guile"

inherit rpm
