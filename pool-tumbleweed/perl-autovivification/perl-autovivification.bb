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

RPM_NAME = "perl-autovivification-0.18-1.30.aarch64.rpm"
RPM_HASH = "38bbb90a3e55ef652c631577879a17387c7637bc1f8a6fe7fb1d554fe7320a2bcbba5e0e262604718dc502118229734c4462011b324d85f532038c327a958fe1"

RPROVIDES:${PN} += "perl-autovivification"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
