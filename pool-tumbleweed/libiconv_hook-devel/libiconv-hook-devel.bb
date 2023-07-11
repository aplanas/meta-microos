SUMMARY = "Header files of libiconv-hook"
DESCRIPTION = "Development and header files for libiconv_hook1"
LICENSE = "OpenSSL"

PV = "0.0.20021209"

RPM_NAME = "libiconv_hook-devel-0.0.20021209-1.28.aarch64.rpm"
RPM_HASH = "6a8be6c5e8b50808e8b03566f2664ec7eee9ae811412fcdba23dc3cf5ba169af52cc7e9eadab203230fd3934d50dcae0e0be9be37bfd7801371793b72ede796b"

RPROVIDES:${PN} += "libiconv-hook-devel"

RDEPENDS:${PN} += "libiconv-hook1"

inherit rpm
