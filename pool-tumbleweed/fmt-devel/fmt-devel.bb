SUMMARY = "Development files for fmt, a formatting library"
DESCRIPTION = "Development files for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "fmt-devel-9.1.0-2.3.aarch64.rpm"
RPM_HASH = "a3aaa90f73e0141e85d2e1efe9bf0c5d35fb652c832b931e81003cb4334389b6d9b06d7f25239cf4b9ac3f9f666e2046cd7d580556bcfc22fc405f72f5643a5f"

RPROVIDES:${PN} += "cmake(fmt) \
fmt-devel \
fmt-devel(aarch-64) \
pkgconfig(fmt)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmt9"

inherit rpm
