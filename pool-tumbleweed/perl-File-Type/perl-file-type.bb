SUMMARY = "determine file type using magic"
DESCRIPTION = "File::Type uses magic numbers (typically at the start of a file) to \
determine the MIME type of that file. \
 \
 \
 \
Authors: \
-------- \
    Paul Mison <pmison at fotango dot com>"
LICENSE = "Artistic-1.0"

PV = "0.22"

RPM_NAME = "perl-File-Type-0.22-163.31.aarch64.rpm"
RPM_HASH = "62801223720bd9e4c99f92645964f34779ee4eff39ccb0b63804ea83b86ad84a26a3c4a036554ec5b495f4fb10d07616034e021591bb60f6da348091981785d1"

RPROVIDES:${PN} += "perl-File--Type \
perl-File--Type--Builder \
perl-File-Type"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
