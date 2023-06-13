SUMMARY = "Virtual Machine for Scheme48"
DESCRIPTION = "Core files of Scheme48 without development environment."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "scheme48-vm-1.9.2-2.18.aarch64.rpm"
RPM_HASH = "cedaad67556063d7c4415906da3cd419d610dfc2d6b842cba18e6e2b3ec5036eee0b103ab391a60a83d5e136c700e53122adcd46c02913be70b2853848787615"

RPROVIDES:${PN} += "scheme48-vm \
scheme48-vm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
