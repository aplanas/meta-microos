SUMMARY = "Modified and extended debugging facilities"
DESCRIPTION = "Data::Peek started off as 'DDumper' being a wrapper module over \
Data::Dumper, but grew out to be a set of low-level data introspection \
utilities that no other module provided yet, using the lowest level of the \
perl internals API as possible."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52"

RPM_NAME = "perl-Data-Peek-0.52-1.2.aarch64.rpm"
RPM_HASH = "e9455479d517e24571210d28ff46fa610e13adafe1c176bbad5054d2a7e930f7dbd4204531cf0114dca63645286d9f5ac090e1974281e6baa2f1a1ef6a135040"

RPROVIDES:${PN} += "perl(Data::Peek) \
perl-Data-Peek \
perl-Data-Peek(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Test::More) \
perl(Test::Warnings)"

inherit rpm
