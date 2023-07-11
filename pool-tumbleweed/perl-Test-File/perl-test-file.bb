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

RPM_NAME = "perl-Test-File-1.993-1.3.aarch64.rpm"
RPM_HASH = "8fa00e112b1406f44a1c94575d25bbc51180058fb974d6304c0aee67fef506e0f478cd07e28ad916340d457c8f26e2d841b104f67261a4a23a835216864c24cb"

RPROVIDES:${PN} += "perl-Test--File \
perl-Test-File"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
