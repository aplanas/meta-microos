SUMMARY = "'Unbless' Perl objects"
DESCRIPTION = "*Acme::Damn* provides a single routine, *damn()*, which takes a blessed \
reference (a Perl object), and _unblesses_ it, to return the original \
reference."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Acme-Damn-0.08-1.26.aarch64.rpm"
RPM_HASH = "eda9054b145ba648fa9b93ce7b534ec440d5fe4fb485a9ecff5868832c05e925b46174f8359f6e5221999cc30943a0f2578873bc2c1129ada4273660d3cf79b6"

RPROVIDES:${PN} += "perl-Acme--Damn \
perl-Acme-Damn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
