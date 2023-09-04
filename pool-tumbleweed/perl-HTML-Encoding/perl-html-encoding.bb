SUMMARY = "Determine the encoding of HTML/XML/XHTML documents"
DESCRIPTION = "HTML::Encoding helps to determine the encoding of HTML and XML/XHTML \
documents."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.61"

RPM_NAME = "perl-HTML-Encoding-0.61-8.31.aarch64.rpm"
RPM_HASH = "875d4e62fa408bfdc86a96aa38a064282d19c2b87c40cf192947096188a07fa45d1fbfca9b395355d42d99d8450037427f1556cfc035f2b8441729be115eab26"

RPROVIDES:${PN} += "perl-HTML--Encoding \
perl-HTML-Encoding"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
