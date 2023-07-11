SUMMARY = "Python adapter for universal, libarchive-based archive access"
DESCRIPTION = "A ctypes-based adapter to libarchive. \
7-Zip is supported for both reading and writing."
LICENSE = "GPL-2.0-only"

PV = "0.4.7"

RPM_NAME = "python39-libarchive-0.4.7-3.14.noarch.rpm"
RPM_HASH = "05c141119c636500cc3564acbe12695ac60282409addd236ed685ef376e94f24b81b2e5a5a3ea559780a00370bd264da34c84a761497244ff2e16c3cfb5106d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-libarchive \
python39-libarchive \
python3dist-libarchive"

RDEPENDS:${PN} += "libarchive-devel \
python-abi"

inherit rpm
