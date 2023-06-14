SUMMARY = "Python adapter for universal, libarchive-based archive access"
DESCRIPTION = "A ctypes-based adapter to libarchive. \
7-Zip is supported for both reading and writing."
LICENSE = "GPL-2.0-only"

PV = "0.4.7"

RPM_NAME = "python39-libarchive-0.4.7-3.12.noarch.rpm"
RPM_HASH = "1ae45d00ab6b6162788ebbf3725c3ffe3deacb68d9ec62de07dc47a52bfd848f6e900f87711c89e42c7ccf516d39204889da4bfcb83949e95e5fc26b20dd6b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-libarchive \
python39-libarchive \
python3dist-libarchive"

RDEPENDS:${PN} += "libarchive-devel \
python-abi"

inherit rpm
