SUMMARY = "A scalable, open extension to CGI"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "perl-FastCGI-2.4.0-173.1.aarch64.rpm"
RPM_HASH = "df435099b17b12a406dc30a49b64827d1da1d3813053f0b0205eb76d30b805ad21d4863a06405e9ede0d0de7b6f9b6c77ae7800bb7b3f9268dcd587618a8646c"

RPROVIDES:${PN} += "perl(FCGI) \
perl(FCGI::Stream) \
perl-FastCGI \
perl-FastCGI(aarch-64)"

RDEPENDS:${PN} += "FastCGI \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
