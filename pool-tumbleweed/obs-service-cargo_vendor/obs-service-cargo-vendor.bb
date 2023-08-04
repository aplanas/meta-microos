SUMMARY = "An OBS source service: Download, verify and vendor Rust crates (libraries)"
DESCRIPTION = "An OBS Source Service that will download, \
verify and vendor Rust crates (libraries)"
LICENSE = "GPL-2.0-or-later"

PV = "0.4.5~6"

RPM_NAME = "obs-service-cargo_vendor-0.4.5~6-1.1.noarch.rpm"
RPM_HASH = "4aaf5f2a18356756e18ec242e73b31cf07038ba37707410639fe0665572de864854359c730ae8a9a4589dc449d3f4b15a061a291e395e5a642f438534d83e438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-cargo-vendor"

RDEPENDS:${PN} += "/usr/bin/python3 \
gzip \
python3 \
python3-zstandard \
tar \
zstd"

inherit rpm
