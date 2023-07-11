SUMMARY = "NFS-Ganesha NFSD shared library"
DESCRIPTION = "This package contains the libraries and headers needed to develop programs \
using NFS-Ganesha NFSD."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "libganesha_nfsd-devel-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "1656f65435186bb2c6e6de28238d3864f5f8cd1075586016a6a04531de3ec1188da496f392e093f491bc690b198378f99891a80d617574ed4391c9d0481d6bc5"

RPROVIDES:${PN} += "libganesha-nfsd-devel"

RDEPENDS:${PN} += "libganesha-nfsd3-3"

inherit rpm
