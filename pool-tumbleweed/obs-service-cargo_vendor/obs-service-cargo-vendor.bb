SUMMARY = "An OBS source service: Download, verify and vendor Rust crates (libraries)"
DESCRIPTION = "An OBS Source Service that will download, \
verify and vendor Rust crates (libraries)"
LICENSE = "GPL-2.0-or-later"

PV = "0.4.5~4"

RPM_NAME = "obs-service-cargo_vendor-0.4.5~4-1.1.noarch.rpm"
RPM_HASH = "af10edcfccd12d034c0cda0a2e4a90a8c5f3b9686bdae4e85dcc39f2936cbd819cb4dcdcacd401862376e61b6a8afcc4f5fcbdf495c247a0c1d9fb44c0df4c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-cargo-vendor"

RDEPENDS:${PN} += "/usr/bin/python3 \
gzip \
python3 \
python3-zstandard \
tar \
zstd"

inherit rpm
