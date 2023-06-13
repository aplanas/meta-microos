SUMMARY = "NFS-Ganesha NFSD shared library"
DESCRIPTION = "This package contains the libraries and headers needed to develop programs \
using NFS-Ganesha NFSD."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "libganesha_nfsd-devel-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "63e483e70d42aa85621fb177bc0d2d334a7411f2fc9c704675ac27468067bfc1b1ff95fbd8f47c40ab56c7656d2a2395f1b454ec0a5be117069ff160d782de5e"

RPROVIDES:${PN} += "libganesha_nfsd-devel \
libganesha_nfsd-devel(aarch-64)"

RDEPENDS:${PN} += "libganesha_nfsd3_3"

inherit rpm
