SUMMARY = "Modified and extended debugging facilities"
DESCRIPTION = "Data::Peek started off as 'DDumper' being a wrapper module over \
Data::Dumper, but grew out to be a set of low-level data introspection \
utilities that no other module provided yet, using the lowest level of the \
perl internals API as possible."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52"

RPM_NAME = "perl-Data-Peek-0.52-1.4.aarch64.rpm"
RPM_HASH = "16a9604ff1a37b50d6efdfbd0f3d8c620009eaabe284a80fcdcd1037e2b3348bf351069d1d93ab0de1bfe2cab62f2adc6e7024b1bd22746c8ad2681e183cd2e3"

RPROVIDES:${PN} += "perl-Data--Peek \
perl-Data-Peek"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Test--More \
perl-Test--Warnings"

inherit rpm
