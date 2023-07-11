SUMMARY = "Development files to link against Ruby"
DESCRIPTION = "Development files to link against Ruby."
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "ruby3.2-devel-3.2.2-1.2.aarch64.rpm"
RPM_HASH = "66a80865329024c506c0a9977a280e99080b6d4a93123a7844e8e4f46ca73b2a0e5b2f5e137fe988d5f605fc99a50d5a3c46d49b6303ad69da80f6a869fa89e2"

RPROVIDES:${PN} += "pkgconfig-ruby-3.2 \
ruby3.2-devel \
rubygems \
rubygems-with-buildroot-patch"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ruby3.2"

inherit rpm
