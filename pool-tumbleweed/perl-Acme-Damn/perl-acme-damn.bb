SUMMARY = "'Unbless' Perl objects"
DESCRIPTION = "*Acme::Damn* provides a single routine, *damn()*, which takes a blessed \
reference (a Perl object), and _unblesses_ it, to return the original \
reference."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Acme-Damn-0.08-1.27.aarch64.rpm"
RPM_HASH = "7471e2947973ca071467fe2e5bb1eca4852e2fa807345e9796388635221ca64b0dfe2e3681444a2112ed968354a31dae1ba92bc8797d1cab8d797bf3d29214fc"

RPROVIDES:${PN} += "perl-Acme--Damn \
perl-Acme-Damn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
