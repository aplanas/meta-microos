SUMMARY = "Change nature of data within a structure"
DESCRIPTION = "'Data::Structure::Util' is a toolbox to manipulate the data inside a data \
structure. It can process an entire tree and perform the operation \
requested on each appropriate element. \
 \
For example: It can transform all strings within a data structure to utf8 \
or transform any utf8 string back to the default encoding. It can remove \
the blessing on any reference. It can collect all the objects or detect if \
there is a circular reference. \
 \
It is written in C for decent speed."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.16"

RPM_NAME = "perl-Data-Structure-Util-0.16-1.30.aarch64.rpm"
RPM_HASH = "7516f4c96fcac2ab07e1d7fdf1203a3298efbfd26a1b4d588f5c2562154f4ffdeaf21faf623e4d2809e20c90894d174736314bf87170fd8920f4074bef51f8c3"

RPROVIDES:${PN} += "perl-Data--Structure--Util \
perl-Data-Structure-Util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
