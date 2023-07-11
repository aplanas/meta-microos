SUMMARY = "Semi-empirical quantum mechanics suite"
DESCRIPTION = "MOPAC7 is a semi-empirical quantum-mechanics code written by James J. P. \
Stewart and co-workers. The purpose of this project is to maintain MOPAC7 as \
a stand-alone program as well as a library that provides the functionality \
of MOPAC7 to other programs."
LICENSE = "SUSE-Public-Domain"

PV = "1.15"

RPM_NAME = "mopac7-1.15-8.4.aarch64.rpm"
RPM_HASH = "f105d2417b675bbb795639592f9fb43185fea34876dabad2e4bade973cf8124750eed86b47f3169141bbd593b28858857e13102cb1a047a97fa442f4e40cb0d1"

RPROVIDES:${PN} += "mopac7"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libmopac7.so.1"

inherit rpm
