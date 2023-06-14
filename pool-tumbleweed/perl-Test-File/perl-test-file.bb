SUMMARY = "Test file attributes"
DESCRIPTION = "This modules provides a collection of test utilities for file attributes. \
 \
Some file attributes depend on the owner of the process testing the file in \
the same way the file test operators do. For instance, root (or super-user \
or Administrator) may always be able to read files no matter the \
permissions. \
 \
Some attributes don't make sense outside of Unix, either, so some tests \
automatically skip if they think they won't work on the platform. If you \
have a way to make these functions work on Windows, for instance, please \
send me a patch. :) If you want to pretend to be Windows on a non-Windows \
machine (for instance, to test 'skip()'), you can set the \
'PRETEND_TO_BE_WINDOWS' environment variable. \
 \
The optional NAME parameter for every function allows you to specify a name \
for the test. If not supplied, a reasonable default will be generated."
LICENSE = "Artistic-2.0"

PV = "1.993"

RPM_NAME = "perl-Test-File-1.993-1.2.aarch64.rpm"
RPM_HASH = "1c516fd9414a7937dce18a23e0bcbb97c17a5568f421401535c571b3202badd140ebe934f75d3b193c6e28e624caab4acad8f64c26a5be6147a9c60cac1a6c3d"

RPROVIDES:${PN} += "perl-Test--File \
perl-Test-File"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
