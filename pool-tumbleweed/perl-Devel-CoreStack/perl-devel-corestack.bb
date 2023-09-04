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

RPM_NAME = "perl-Devel-CoreStack-1.3-306.31.aarch64.rpm"
RPM_HASH = "009ec1e1299e2a44fdc0e9dd87a803987919b8716fea3a58f7446d6949a6cb166e374fd9b02f09e1f946d246f32751144ce41b2d77f036c1403ef44241527d81"

RPROVIDES:${PN} += "Devel-CoreStack \
perl-Devel--CoreStack \
perl-Devel-CoreStack"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
