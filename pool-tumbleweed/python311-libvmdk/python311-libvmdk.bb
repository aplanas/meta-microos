SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python311-libvmdk-20221124-3.10.aarch64.rpm"
RPM_HASH = "ee4c48b57c8141f6cd6e2902d7731981372c0e254a8ba76c6decd281a95e53088b2f7ac5cf703998b499c9a437b1be5bac474f7c061977658367e3dca9d26b5e"

RPROVIDES:${PN} += "python3-libvmdk \
python311-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm
