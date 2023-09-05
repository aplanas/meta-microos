SUMMARY = "Development package for kio_audiocd"
DESCRIPTION = "This package contains the development files for the audiocd kio slave"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kio_audiocd-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "ce672548885a7780da7cd60f8f0bfe3df0ea511f793941b316ca23a3fa2a720d6e219bddb619d0898da8efd0d46c49260e92b51a1764b97b1c79db321d872369"

RPROVIDES:${PN} += "kio-audiocd-devel"

RDEPENDS:${PN} += "kio-audiocd"

inherit rpm
