SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python39-libvmdk-20221124-3.10.aarch64.rpm"
RPM_HASH = "d43c31a4782d9944660f27e3ccde162b64b4a6ec169da904594a9f27c3e38b8af18c31190eef0e2603020f655d1f74f03e08c9c00d9e0ec81aa5e16ace2e1412"

RPROVIDES:${PN} += "python39-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm
