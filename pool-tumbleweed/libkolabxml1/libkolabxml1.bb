SUMMARY = "Kolab XML Format Schema Definitions Library"
DESCRIPTION = "Libkolabxml serves as a serialization/de-serialization library for the the Kolab XML Format \
 \
Features: \
- Based on official standards: \
- Todos/Events/Journals are fully xCal compliant \
- Contacts/Distributionlists are fully xCard compliant \
- Can model everything which is used in the Kolab XML Format 2.0, Kontact and Roundcube. \
- Easily extensible \
- Canonical storage format \
- Supports Todos/Events/Journals/Contacts/Distribution Lists/Notes/Configurations"
LICENSE = "LGPL-3.0-or-later"

PV = "1.1.6"

RPM_NAME = "libkolabxml1-1.1.6-13.12.aarch64.rpm"
RPM_HASH = "893c4a99ad59570712cea76fcf90589a03b62056a6a0dbfe5baf613cd0d12cdfa5ae79f1c0faca3751876f35cc5a2151daf8330ec9e57fe843dac6b9c79359ec"

RPROVIDES:${PN} += "libkolabxml.so.1 \
libkolabxml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxerces-c-3.2.so"

inherit rpm
