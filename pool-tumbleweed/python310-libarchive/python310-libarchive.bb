SUMMARY = "Python adapter for universal, libarchive-based archive access"
DESCRIPTION = "A ctypes-based adapter to libarchive. \
7-Zip is supported for both reading and writing."
LICENSE = "GPL-2.0-only"

PV = "0.4.7"

RPM_NAME = "python310-libarchive-0.4.7-3.14.noarch.rpm"
RPM_HASH = "4ca830ed9b351308bcd9e0ce6b3c4a81579c10f07f4eb571301da16046b7dfe8379c5668f560d9468fa164c46389a077d53360f65e7fba22ecedc96a57e34406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-libarchive \
python310-libarchive \
python3dist-libarchive"

RDEPENDS:${PN} += "libarchive-devel \
python-abi"

inherit rpm
