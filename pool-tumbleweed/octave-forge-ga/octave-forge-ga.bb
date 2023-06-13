SUMMARY = "Genetic optimization code for Octave"
DESCRIPTION = "Genetic optimization code. \
This is part of Octave-Forge project."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.3"

RPM_NAME = "octave-forge-ga-0.10.3-1.7.noarch.rpm"
RPM_HASH = "8957f615e8a4d0967fd67538b32da2bcc7024b6de122e76496d834dd83a3ba7644ccc6d426ce9569b4a0c9b7dc1b6342ccc5c8db41a4e0d23923c588771f48b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-ga"

RDEPENDS:${PN} += "/bin/sh \
octave-cli"

inherit rpm
