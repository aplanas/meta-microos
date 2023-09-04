SUMMARY = "Lexically disable autovivification"
DESCRIPTION = "When an undefined variable is dereferenced, it gets silently upgraded to an \
array or hash reference (depending of the type of the dereferencing). This \
behaviour is called _autovivification_ and usually does what you mean (e.g. \
when you store a value) but it may be unnatural or surprising because your \
variables gets populated behind your back. This is especially true when \
several levels of dereferencing are involved, in which case all levels are \
vivified up to the last, or when it happens in intuitively read-only \
constructs like 'exists'. \
 \
This pragma lets you disable autovivification for some constructs and \
optionally throws a warning or an error when it would have happened."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.18"

RPM_NAME = "perl-autovivification-0.18-1.31.aarch64.rpm"
RPM_HASH = "e423001df118a1640ae40473dd20cbd0a33decb433928d44468be16285dbefc0845648ca7359b7875aa923a656c37f3baf4b8bf57656977a90a5d5ab153ac0bd"

RPROVIDES:${PN} += "perl-autovivification"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
