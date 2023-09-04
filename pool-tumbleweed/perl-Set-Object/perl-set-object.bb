SUMMARY = "Set of objects and strings"
DESCRIPTION = "This modules implements a set of objects, that is, an unordered collection \
of objects without duplication. \
 \
The term _objects_ is applied loosely - for the sake of Set::Object, \
anything that is a reference is considered an object. \
 \
Set::Object 1.09 and later includes support for inserting scalars \
(including the empty string, but excluding 'undef') as well as objects. \
This can be thought of as (and is currently implemented as) a degenerate \
hash that only has keys and no values. Unlike objects placed into a \
Set::Object, scalars that are inserted will be flattened into strings, so \
will lose any magic (eg, tie) or other special bits that they went in with; \
only strings come out."
LICENSE = "Artistic-2.0"

PV = "1.42"

RPM_NAME = "perl-Set-Object-1.42-1.10.aarch64.rpm"
RPM_HASH = "6d4a2f67afa730ff44a654add78848a2f038fc82956b0363d0f7dc8790af993dcdca5c6f1b024d0d685d5355daaafa1f6edc6e4f8c2c672d887f564cea2ba5b0"

RPROVIDES:${PN} += "perl-Set--Object \
perl-Set--Object--Weak \
perl-Set-Object"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
