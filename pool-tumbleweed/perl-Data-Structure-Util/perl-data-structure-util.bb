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

RPM_NAME = "perl-Data-Structure-Util-0.16-1.29.aarch64.rpm"
RPM_HASH = "a9cc7323bea8172dc62f9a0aee5cd6676e9393f35522096db2e77ae688092c4c66218797d7136b7f3c4d91aabb9fa3361308f596c8d078a06edba491f11fe8e6"

RPROVIDES:${PN} += "perl-Data--Structure--Util \
perl-Data-Structure-Util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
