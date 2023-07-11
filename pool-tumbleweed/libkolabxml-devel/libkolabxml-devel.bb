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

RPM_NAME = "libkolabxml-devel-1.1.6-13.12.aarch64.rpm"
RPM_HASH = "2e4d00f5a4d6051cb5f4b04833ad79c619784d2825d939a517bf38053983cf57bdcd5cf98937a19934f305a9dec6be346eea5f24652777c276baba762fbc4cba"

RPROVIDES:${PN} += "cmake-Libkolabxml \
libkolabxml-devel"

RDEPENDS:${PN} += "libboost-chrono-devel \
libboost-date-time-devel \
libboost-system-devel \
libboost-thread-devel \
libcurl-devel \
libkolabxml1 \
libxerces-c-devel"

inherit rpm
