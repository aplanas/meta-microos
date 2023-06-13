SUMMARY = "Common Files for FreeWnn"
DESCRIPTION = "This package includes files you need to run FreeWnn, Free cWnn, Free \
tWnn, or Free kWnn.  Install this package if you will be using any part \
of the Wnn System."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fwnncom-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "4ba7c0ad8fb7a6fa5a0cad61d6d0dc0ff571f41b7fd6d04eb85786a56dc8e08d09fb1df59333e7a3914386d689e9f5af4c8884e8d6287538ebcdfd0436b729f4"

RPROVIDES:${PN} += "config(fwnncom) \
fwnncom \
fwnncom(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
shadow"

inherit rpm
