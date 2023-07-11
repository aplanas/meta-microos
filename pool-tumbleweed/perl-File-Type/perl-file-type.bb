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

RPM_NAME = "perl-File-Type-0.22-163.30.aarch64.rpm"
RPM_HASH = "3bb15f4d737fd54a36af6d1795e5c3ae7f8575da2dfc67ec3403e61ecd10d9e25e16145f82e526ba5b2590b61fe58303ec0ecc25db8822087f26c8babc4ad684"

RPROVIDES:${PN} += "perl-File--Type \
perl-File--Type--Builder \
perl-File-Type"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
