SUMMARY = "GrandOrgue demo sampleset"
DESCRIPTION = "This package contains the demo sampleset for GrandOrgue."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "grandorgue-demo-3.12.2-1.2.noarch.rpm"
RPM_HASH = "7b91d375512a9ed0c14bf3c051268c0efd7630545faf40647489ff6689e563130396776fa7c01ac60929128d96886aa998b68e90901b79da3c64ff829665aead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grandorgue-demo"

RDEPENDS:${PN} += ""

inherit rpm
