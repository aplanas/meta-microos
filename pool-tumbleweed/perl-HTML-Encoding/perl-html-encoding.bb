SUMMARY = "Determine the encoding of HTML/XML/XHTML documents"
DESCRIPTION = "HTML::Encoding helps to determine the encoding of HTML and XML/XHTML \
documents."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.61"

RPM_NAME = "perl-HTML-Encoding-0.61-8.29.aarch64.rpm"
RPM_HASH = "b88f07a90b5d614e06110019bd7f2c38b7f90cd310305ef8a95d3b4ccc0026938d075333f575274caf94ef3ce49fefb42cfea06bfb8f22d023d523a824ad3b13"

RPROVIDES:${PN} += "perl-HTML--Encoding \
perl-HTML-Encoding"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
