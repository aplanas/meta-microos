SUMMARY = "Java-based P7Zip GUI for data compression and backup"
DESCRIPTION = "J7Z is an alternative 7-Zip GUI. (7-Zip is a file archiver.) \
With J7Z, you can update existing archive, backup multiple \
directories to a storage location, create or extract protected \
archives. It allows using archiving profiles and lists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "J7Z-1.4.2-2.15.noarch.rpm"
RPM_HASH = "549ee6efd82a79ad1da6f3cf7a1b725f38d0dd9a8567d5ff6e4fb7b8aeaff945329d5999d39c272100a36fd0dfcb0c8e65d46a374353155abd50a7c385b49cf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "J7Z \
application() \
application(J7Z.desktop)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
java \
p7zip"

inherit rpm
