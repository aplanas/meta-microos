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

RPM_NAME = "perl-XML-Writer-String-0.1-9.29.aarch64.rpm"
RPM_HASH = "4d51923a2a4691d2acc33310f00c6c6cf65817af7cfb61623bef188bf2f20aad696e47f10b0d32b725bc22538615111d17b562f2d4e9a5a8aa938c7259138f9d"

RPROVIDES:${PN} += "perl(XML::Writer::String) \
perl-XML-Writer-String \
perl-XML-Writer-String(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl-XML-Writer"

inherit rpm
