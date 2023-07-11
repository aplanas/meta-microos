SUMMARY = "Modified and extended debugging facilities"
DESCRIPTION = "Data::Peek started off as 'DDumper' being a wrapper module over \
Data::Dumper, but grew out to be a set of low-level data introspection \
utilities that no other module provided yet, using the lowest level of the \
perl internals API as possible."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52"

RPM_NAME = "perl-Data-Peek-0.52-1.3.aarch64.rpm"
RPM_HASH = "72c10b1d75c9c69fde2007bb2baa4f5b37e7c84de2c61f4a262a3d56da8016f11abbbd3d7e0838ab080fc76f282ae57152ac0f023e1aa99e31ea870f47fcbbdc"

RPROVIDES:${PN} += "perl-Data--Peek \
perl-Data-Peek"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Test--More \
perl-Test--Warnings"

inherit rpm
