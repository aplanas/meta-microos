SUMMARY = "Development files to link against Ruby"
DESCRIPTION = "Development files to link against Ruby."
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "ruby3.2-devel-3.2.2-1.1.aarch64.rpm"
RPM_HASH = "8f05d3427a559759da4569bd563c0a8404f1fc4fa4cb996ce161505419508caf4367fd733e8b5f3610314663fd02a50c656ea0f2fd4820123248cabdc8b72bc3"

RPROVIDES:${PN} += "pkgconfig-ruby-3.2 \
ruby3.2-devel \
rubygems \
rubygems-with-buildroot-patch"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ruby3.2"

inherit rpm
