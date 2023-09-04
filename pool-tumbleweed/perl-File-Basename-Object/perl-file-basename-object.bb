SUMMARY = "Object-oriented syntax sugar for File::Basename"
DESCRIPTION = "File::Basename::Object is an object-oriented wrapper around \
File::Basename. The goal is to allow pathnames to be presented and \
manipulated easily. \
 \
 \
 \
Authors: \
-------- \
    Tyler 'Crackerjack' MacDonald <japh@crackerjack.net>"
LICENSE = "Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-File-Basename-Object-0.01-64.31.aarch64.rpm"
RPM_HASH = "0c64dd569fff8b259e6b9288a79a931319241084145711c52411e04a83b43136072e3461f777073f5c96a63faafa55acccb55aede9470be520fa14de2106e330"

RPROVIDES:${PN} += "perl-File--Basename--Object \
perl-File-Basename-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
