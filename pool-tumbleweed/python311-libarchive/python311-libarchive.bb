SUMMARY = "Python adapter for universal, libarchive-based archive access"
DESCRIPTION = "A ctypes-based adapter to libarchive. \
7-Zip is supported for both reading and writing."
LICENSE = "GPL-2.0-only"

PV = "0.4.7"

RPM_NAME = "python311-libarchive-0.4.7-3.14.noarch.rpm"
RPM_HASH = "3d2fe5895ec723cf80eebdd48905aa075e44c90ed61953deafff428696e66d96e8918f9f17e87a9ba52a67b233b4953bedbbe8ed187e3c60313ee2f93c953dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libarchive \
python3.11dist-libarchive \
python311-libarchive \
python3dist-libarchive"

RDEPENDS:${PN} += "libarchive-devel \
python-abi"

inherit rpm
