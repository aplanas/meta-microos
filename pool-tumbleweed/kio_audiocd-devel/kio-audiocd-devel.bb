SUMMARY = "Development package for kio_audiocd"
DESCRIPTION = "This package contains the development files for the audiocd kio slave"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kio_audiocd-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "218d90373bddc288a852c6c2364b6019bfbaeec129b32e5f32f5dc962f97aa7f3e9221cbea4e5f36053566427a52be3560eab8572495b10c89bc868a9fb4e8e2"

RPROVIDES:${PN} += "kio_audiocd-devel \
kio_audiocd-devel(aarch-64)"

RDEPENDS:${PN} += "kio_audiocd"

inherit rpm
