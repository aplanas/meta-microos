SUMMARY = "Development files for deadbeef"
DESCRIPTION = "This package provides headers for DeaDBeeF plugins development."
LICENSE = "Zlib"

PV = "1.9.5"

RPM_NAME = "deadbeef-devel-1.9.5-2.2.aarch64.rpm"
RPM_HASH = "ba4452d0b2f069d952e471ab77cabef9b5fb0fb6021d1c3749d219c44667f34576bf787a3c6b76bb6c942fc54fd7d49646bd803a73f58ebb91e7a1541211efe7"

RPROVIDES:${PN} += "deadbeef-devel"

RDEPENDS:${PN} += "deadbeef"

inherit rpm
