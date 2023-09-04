SUMMARY = "A scalable, open extension to CGI"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "perl-FastCGI-2.4.0-173.3.aarch64.rpm"
RPM_HASH = "676bc3b13c1cae27a4875b73920fe00ee72f027a3ace10462bf30f67d391e28998e522aa6fbc9a2dfe880463ef13c8b56b5ffd731e9dedf1a669071aff7fd89f"

RPROVIDES:${PN} += "perl-FCGI \
perl-FCGI--Stream \
perl-FastCGI"

RDEPENDS:${PN} += "FastCGI \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
