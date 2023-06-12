SUMMARY = "Development files for libfguid, a GUID/UUID data type library"
DESCRIPTION = "A library for GUID/UUID data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfguid."
LICENSE = "LGPL-3.0-or-later"

PV = "20220113"

RPM_NAME = "libfguid-devel-20220113-3.2.aarch64.rpm"
RPM_HASH = "4a868b79598a83a5fc09667f809a279eba3a650075b029cd7cbd7e386a2f5e0ddd3e5a14b91d3f383d9c98050f76c55a222181318209857e088e3316e41b221a"

RPROVIDES:${PN} += "libfguid-devel \
libfguid-devel(aarch-64) \
pkgconfig(libfguid)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfguid1"

inherit rpm
