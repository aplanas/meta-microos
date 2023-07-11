SUMMARY = "Common Files for FreeWnn"
DESCRIPTION = "This package includes files you need to run FreeWnn, Free cWnn, Free \
tWnn, or Free kWnn.  Install this package if you will be using any part \
of the Wnn System."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fwnncom-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "eed0a51aea85a81a5cd33f5b7d50d9409b6a4f0843416ef4ac8250b88c806815e8a12d951bda2ab093f1d95b3deac2f0611fcdb7b90557c4a730e9eb0f1d53b8"

RPROVIDES:${PN} += "config-fwnncom \
fwnncom"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
