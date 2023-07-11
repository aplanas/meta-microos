SUMMARY = "Determine the encoding of HTML/XML/XHTML documents"
DESCRIPTION = "HTML::Encoding helps to determine the encoding of HTML and XML/XHTML \
documents."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.61"

RPM_NAME = "perl-HTML-Encoding-0.61-8.30.aarch64.rpm"
RPM_HASH = "2f0b9538b06462a9daa859b6f5fbe05897482efd7fead2bae1e4d2c436f2b0bc337d10fdabb2e545e9a00ee064bcd390cfaeff47b35da0bd4672de4a02ba2872"

RPROVIDES:${PN} += "perl-HTML--Encoding \
perl-HTML-Encoding"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
