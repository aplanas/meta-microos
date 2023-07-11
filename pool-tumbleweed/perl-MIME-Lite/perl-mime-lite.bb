SUMMARY = "Low-calorie MIME generator"
DESCRIPTION = "In the never-ending quest for great taste with fewer calories, we proudly \
present: _MIME::Lite_. \
 \
MIME::Lite is intended as a simple, standalone module for generating (not \
parsing!) MIME messages... specifically, it allows you to output a simple, \
decent single- or multi-part message with text or binary attachments. It \
does not require that you have the Mail:: or MIME:: modules installed, but \
will work with them if they are. \
 \
You can specify each message part as either the literal data itself (in a \
scalar or array), or as a string which can be given to open() to get a \
readable filehandle (e.g., '<filename' or 'somecommand|'). \
 \
You don't need to worry about encoding your message data: this module will \
do that for you. It handles the 5 standard MIME encodings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.033"

RPM_NAME = "perl-MIME-Lite-3.033-1.10.noarch.rpm"
RPM_HASH = "e6b7e7cf29c20443ee73014bb59329463eb840fb305e1b517981fc48f73e1ebe9eb732e1ded831be85efb755a07074df0290225b189b35be57383b1617bbf84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Lite \
perl-MIME--Lite--IO-Handle \
perl-MIME--Lite--IO-Scalar \
perl-MIME--Lite--IO-ScalarArray \
perl-MIME--Lite--SMTP \
perl-MIME-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Email--Date--Format \
perl-MIME--Types \
perl-Mail--Address"

inherit rpm
