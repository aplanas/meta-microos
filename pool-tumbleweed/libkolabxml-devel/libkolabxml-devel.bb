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

RPM_NAME = "libkolabxml-devel-1.1.6-13.11.aarch64.rpm"
RPM_HASH = "33242f89a348bea91e5f20388291e14c71b5386f34cc19bedd5f1d4122f7c3512c6eb478b4dd867710e9a6f4ab9e48b569413fe3991b0519f7ba47987b640774"

RPROVIDES:${PN} += "cmake(Libkolabxml) \
libkolabxml-devel \
libkolabxml-devel(aarch-64)"

RDEPENDS:${PN} += "libboost_chrono-devel \
libboost_date_time-devel \
libboost_system-devel \
libboost_thread-devel \
libcurl-devel \
libkolabxml1 \
libxerces-c-devel"

inherit rpm
