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

RPM_NAME = "perl-IO-String-1.08-165.30.aarch64.rpm"
RPM_HASH = "eb037db7de1e2ce71657eddccad10e5d5320cbe3c5bd21d378bc6ea700bad70e5629f995d6113bf0f442cd48e60ef108d6895ed714f545c57614134621ddce37"

RPROVIDES:${PN} += "perl-IO--String \
perl-IO-String"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
