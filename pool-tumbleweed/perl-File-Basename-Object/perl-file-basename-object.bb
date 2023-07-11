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

RPM_NAME = "perl-File-Basename-Object-0.01-64.30.aarch64.rpm"
RPM_HASH = "59f9ead9d1872d426fdd31dc3f7ed7d1c0f91112ed8f81f528ede93959e85323b6239ca0d26a3cd7bc48b1da20c534ae64fae52b021901ff889cbee4b0ef122f"

RPROVIDES:${PN} += "perl-File--Basename--Object \
perl-File-Basename-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
