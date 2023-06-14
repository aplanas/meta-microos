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

RPM_NAME = "libkolabxml1-1.1.6-13.11.aarch64.rpm"
RPM_HASH = "8d51bb8b85a6dbda69a7ab6285f7c444d66abaf5b672397b016c1bdef12e205a35359b3937a9b8cb88b8a8d9dfb4098cc74ac77a352482f9b4f22a502fd5c1f6"

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
