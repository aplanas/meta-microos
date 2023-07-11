SUMMARY = "try to generate a stack dump from a core file"
DESCRIPTION = "This module attempts to generate a stack dump from a core file by \
locating the best available debugger (if any) and running it with the \
appropriate arguments and command script. \
 \
 \
 \
Authors: \
-------- \
    Alligator Descartes <descarte@hermetica.com> \
    Tim Bunce"
LICENSE = "Artistic-1.0"

PV = "1.3"

RPM_NAME = "perl-Devel-CoreStack-1.3-306.30.aarch64.rpm"
RPM_HASH = "28bbd6d4883c4d7a88a54ebba64f34417abf5d614856a02998595afc0f501469ee89f78a21fff0041f1d8bedcb7d368279f81339be141b0a595df4ada04881fb"

RPROVIDES:${PN} += "Devel-CoreStack \
perl-Devel--CoreStack \
perl-Devel-CoreStack"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
