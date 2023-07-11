SUMMARY = "A scalable, open extension to CGI"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "perl-FastCGI-2.4.0-173.2.aarch64.rpm"
RPM_HASH = "f6b2680bbd764baad3bc849999de395bbe9174c3bbeb012c2b7d1af7174ff4230223fa4943b364e28492d1490ff7db4671745effde678de21cd961411fd02950"

RPROVIDES:${PN} += "perl-FCGI \
perl-FCGI--Stream \
perl-FastCGI"

RDEPENDS:${PN} += "FastCGI \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
