SUMMARY = "Capture output from XML::Writer"
DESCRIPTION = "This module implements a bare-bones class specifically for the purpose of \
capturing data from the XML::Writer module. XML::Writer expects an IO::Handle \
object and writes XML data to the specified object (or STDOUT) via it's print() \
method. This module simulates such an object for the specific purpose of \
providing the required print() method. \
 \
It is recommended that $writer->end() is called prior to calling $s->value() to \
check for well-formedness. \
 \
Author: \
------- \
    Simon Oliver <simon.oliver@umist.ac.uk>"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.1"

RPM_NAME = "perl-XML-Writer-String-0.1-9.31.aarch64.rpm"
RPM_HASH = "dee8eb437ac66c5c3015b6e20b46968506958c6fb9b78ac21c7dce6454ec9ca1a380083f691cbf7ea36e5f122590db99b862eb6bee46428190a4668d4d423d29"

RPROVIDES:${PN} += "perl-XML--Writer--String \
perl-XML-Writer-String"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-XML-Writer"

inherit rpm
