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

RPM_NAME = "perl-Data-Structure-Util-0.16-1.31.aarch64.rpm"
RPM_HASH = "53e0ddb9799187104a16524572a058102246995e0d2bd797bd95e9e068e9a15a457b29de9c6db1657f4bf26923aa007f1a84ad8f80617670ee6f64d59fc406b0"

RPROVIDES:${PN} += "perl-Data--Structure--Util \
perl-Data-Structure-Util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
