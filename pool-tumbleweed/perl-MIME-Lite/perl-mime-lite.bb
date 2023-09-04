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

RPM_NAME = "perl-MIME-Lite-3.033-1.11.noarch.rpm"
RPM_HASH = "2e877c686b3a7e3837b786cee7cf43a98d29423dd9d7a61c5e2ac40fed593b357ac462708c1f240ef4f87387a8d3c73ebb2eb24c9b2ddd798e392cbdb6f0a034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Lite \
perl-MIME--Lite--IO-Handle \
perl-MIME--Lite--IO-Scalar \
perl-MIME--Lite--IO-ScalarArray \
perl-MIME--Lite--SMTP \
perl-MIME-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Email--Date--Format \
perl-MIME--Types \
perl-Mail--Address"

inherit rpm
