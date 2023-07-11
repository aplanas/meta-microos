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

RPM_NAME = "perl-XML-Writer-String-0.1-9.30.aarch64.rpm"
RPM_HASH = "062fbf068ca44274712210be0392301b2350ceb3ec8aa7ee00dd73be29ad17654e0bc8b6aa4ff92190cbe8de52fa0af344403be5b0b57ff142ced80ae0acf1dc"

RPROVIDES:${PN} += "perl-XML--Writer--String \
perl-XML-Writer-String"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML-Writer"

inherit rpm
