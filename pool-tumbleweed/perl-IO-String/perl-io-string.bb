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

RPM_NAME = "perl-IO-String-1.08-165.29.aarch64.rpm"
RPM_HASH = "2ec04d711cf07af8ae0eda8c68bafb925b8f4edd740e293f5ab3af43d941bfa1f555568c5569ce42d22c3d52d57674c9424e09770058970fa568fcfeb2f9cc14"

RPROVIDES:${PN} += "perl-IO--String \
perl-IO-String"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
