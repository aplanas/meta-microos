SUMMARY = "Copy of TIRPC headers from NFS-Ganesha"
DESCRIPTION = "This package contains the libraries and headers needed to develop programs \
using NFS-Ganesha transport-independent RPC (TI-RPC)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "libntirpc-devel-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "bf6fe4ba3277534e51629f42b0a0658f7b0150b076573fb845e36b4e87d5b7c8b085d5af60b65b925ee4c94f008c86418def92e58c4b6d6306b435727f6c6d51"

RPROVIDES:${PN} += "libntirpc-devel \
pkgconfig-libntirpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libntirpc3-3"

inherit rpm
