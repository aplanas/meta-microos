SUMMARY = "Tools to access the VMDK image format"
DESCRIPTION = "Several tools for accessing VMware Virtual Disk (VMDK) files. \
 \
See libvmdk for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk-tools-20221124-3.10.aarch64.rpm"
RPM_HASH = "f42168058beac703b293b2e63944ab18920358a58ba702a36076b355d969883777c91044e87aa6b68ee57af0d4f10313933ec98c056556802b5da6bef0070b16"

RPROVIDES:${PN} += "libvmdk-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfuse.so.2 \
libvmdk.so.1"

inherit rpm
