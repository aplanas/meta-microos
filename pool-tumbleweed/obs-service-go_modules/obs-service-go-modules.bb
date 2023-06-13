SUMMARY = "An OBS source service: Download, verify and vendor Go module dependencies"
DESCRIPTION = "An OBS Source Service that will download, \
verify and vendor Go module dependency sources. \
 \
Using go.mod and go.sum present in a Go application, \
the source service will call Go tools in sequence: \
 \
go mod download \
go mod verify \
go mod vendor \
 \
Then create a vendor.tar.gz populated with the contents of \
vendor/"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.3"

RPM_NAME = "obs-service-go_modules-0.6.3-1.1.noarch.rpm"
RPM_HASH = "6f641b0e7b374009b707d379575189158c1a0f04e1ca74aefc2b6f68bf27a5e0489ec0f3bdf398f273b370c69efbe79fed88759fc767df58ba693cc5a87a9a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-go_modules"

RDEPENDS:${PN} += "/usr/bin/env \
go \
python3-libarchive-c"

inherit rpm
