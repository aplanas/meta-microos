SUMMARY = "Documentation for tntdb"
DESCRIPTION = "Tntdb is a library for simple database access. \
 \
The database independent layer offers easy to use methods for working with the database and also greatly simplifies resource-management. The classes hold reference-counted pointers to the actual implementation. They are copyable and assignable. The user can use the classes just like simple values. The resources they reference are freed, when the last reference is deleted. This happens normally just by leaving the scope. There is normally no reason to instantiate them dynamically on the heap. \
 \
This package contains documentation"
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-doc-1.4-1.12.noarch.rpm"
RPM_HASH = "73158e7d37c526496dc285ba9e8ea365f837b7f9216d2916635fede83e34508ba659cc980b3134f34b1d4369064fad7dfbfabfe258ebdf85f8ea1ca46cf828ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tntdb-doc"

RDEPENDS:${PN} += ""

inherit rpm
