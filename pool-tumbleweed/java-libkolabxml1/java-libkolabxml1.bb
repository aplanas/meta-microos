SUMMARY = "Java bindings for libkolabxml"
DESCRIPTION = "Libkolabxml serves as a serialization/de-serialization library for the the Kolab XML Format \
 \
Features: \
- Based on official standards: \
- Todos/Events/Journals are fully xCal compliant \
- Contacts/Distributionlists are fully xCard compliant \
- Can model everything which is used in the Kolab XML Format 2.0, Kontact and Roundcube. \
- Easily extensible \
- Canonical storage format \
- Supports Todos/Events/Journals/Contacts/Distribution Lists/Notes/Configurations \
 \
This package provides the java bindings for Libkolabxml"
LICENSE = "LGPL-3.0-or-later"

PV = "1.1.6"

RPM_NAME = "java-libkolabxml1-1.1.6-13.12.aarch64.rpm"
RPM_HASH = "835271890c13abce40da6951b884371de9834cf0f90b01747dafbda30c7d264de4a0025238e14f07294002468e8588b22d89ff8bcd8ae9b2db677045f1fc8f5a"

RPROVIDES:${PN} += "java-kolabformat \
java-libkolabxml1"

RDEPENDS:${PN} += "libkolabxml1"

inherit rpm
