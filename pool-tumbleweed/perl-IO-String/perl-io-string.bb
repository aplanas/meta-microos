SUMMARY = "Perl IO/String interface"
DESCRIPTION = "IO::String is an IO::File (and IO::Handle) compatible class that reads \
or writes data from in-core strings. \
 \
 \
 \
Authors: \
-------- \
    Gisle Aas.  <gisle@aas.no>"
LICENSE = "Artistic-1.0"

PV = "1.08"

RPM_NAME = "perl-IO-String-1.08-165.31.aarch64.rpm"
RPM_HASH = "edba3932a365fe87dba55f6a487b522a23a6a4686b27768b4d5f6af514a9daa4bdd5cf90f2e758e2575ccebda4c729918e0c664279c6d44f8e8ef8a975e2e51d"

RPROVIDES:${PN} += "perl-IO--String \
perl-IO-String"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
