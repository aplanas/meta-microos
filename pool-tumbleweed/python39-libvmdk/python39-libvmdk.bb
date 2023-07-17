SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python39-libvmdk-20221124-3.11.aarch64.rpm"
RPM_HASH = "ebe8fa280472be6596723935e03366c40d9e1558ad17f0f1aaf2e8e8253a3ce7e5da5581140b8f275307f1c3f284257ef518c16f12aea0c409612a93f1d3cb61"

RPROVIDES:${PN} += "python39-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm
