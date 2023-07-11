SUMMARY = "Genetic optimization code for Octave"
DESCRIPTION = "Genetic optimization code. \
This is part of Octave-Forge project."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.3"

RPM_NAME = "octave-forge-ga-0.10.3-1.8.noarch.rpm"
RPM_HASH = "038e2f7a1dbf5597aeb4b845c38e915cab947bed7edae3f4584fab79a6b53c3cb7d343b51321f8c8ac7c7e4f44846dcd7a8346133d98348b8f210550f4283402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-ga"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
