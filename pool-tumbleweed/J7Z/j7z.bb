SUMMARY = "Java-based P7Zip GUI for data compression and backup"
DESCRIPTION = "J7Z is an alternative 7-Zip GUI. (7-Zip is a file archiver.) \
With J7Z, you can update existing archive, backup multiple \
directories to a storage location, create or extract protected \
archives. It allows using archiving profiles and lists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "J7Z-1.4.2-2.16.noarch.rpm"
RPM_HASH = "336560c37bfa83a08db0af5adcab2a3adb822f391678fb794593c5aedbe5bf51f96ae6e4c27a615455cdca67704806b29154d506ccf56acd952ac7f38c090f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "J7Z"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
java \
p7zip"

inherit rpm
