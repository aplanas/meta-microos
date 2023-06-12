SUMMARY = "Dynamic generation of nested combinations of variants"
DESCRIPTION = "NOTE: This is alpha code and liable to change while it and \
Test::WriteVariants mature. \
 \
The tumble() method calls a sequence of 'provider' code references each of \
which returns a hash. The first provider is called and then, for each hash \
item it returns, the tumble() method recurses to call the next provider. \
 \
The recursion continues until there are no more providers to call, at which \
point the consumer code reference is called. Effectively the providers \
create a tree of combinations and the consumer is called at the leafs of \
the tree. \
 \
If a provider returns no items then that part of the tree is pruned. \
Further providers, if any, are not called and the consumer is not called. \
 \
During a call to tumble() three values are passed down through the tree and \
into the consumer: path, context, and payload. \
 \
The path and context are derived from the names and values of the hashes \
returned by the providers. Typically the path define the current 'path' \
through the tree of combinations. \
 \
The providers are passed the current path, context, and payload. The \
payload is cloned at each level of recursion so that any changes made to it \
by providers are only visible within the scope of the generated sub-tree. \
 \
Note that although the example above shows the path, context and payload as \
array references, the tumbler code makes no assumptions about them. They \
can be any kinds of values. \
 \
See Test::WriteVariants for a practical example use."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010"

RPM_NAME = "perl-Data-Tumbler-0.010-1.17.noarch.rpm"
RPM_HASH = "8963901a545cda87c945e9bb1a7999198fd07a1434a88aeae86fa4cdb20503766de156e3fb562d1a627c1fbc615ff51f90486d31554ec297b812807731b7398d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Tumbler) \
perl-Data-Tumbler"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm