SUMMARY = "Documentation for tntdb"
DESCRIPTION = "Tntdb is a library for simple database access. \
 \
The database independent layer offers easy to use methods for working with the database and also greatly simplifies resource-management. The classes hold reference-counted pointers to the actual implementation. They are copyable and assignable. The user can use the classes just like simple values. The resources they reference are freed, when the last reference is deleted. This happens normally just by leaving the scope. There is normally no reason to instantiate them dynamically on the heap. \
 \
This package contains documentation"
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-doc-1.4-1.13.noarch.rpm"
RPM_HASH = "c0cf62aac79de0144c55d70fe6aad40093d91114cf8139abcd71fab105fc4b30fa290a5b646738011d1da3d2af3793f71c383924e0915ec5b6bd86ee4ce18d80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tntdb-doc"

RDEPENDS:${PN} += ""

inherit rpm
