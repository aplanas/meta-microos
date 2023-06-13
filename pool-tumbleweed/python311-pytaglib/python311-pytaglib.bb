SUMMARY = "Metadata 'tagging' library based on TagLib"
DESCRIPTION = "pytaglib is an audio metadata (“tag”) library for Python. \
It relies on the TagLib C++ library."
LICENSE = "GPL-3.0-only | MIT"

PV = "1.5.0"

RPM_NAME = "python311-pytaglib-1.5.0-1.5.aarch64.rpm"
RPM_HASH = "99ec824b81f035410dadeb8e93f7f7b0a543379223a751ee6ae6828de1c0e175435edc7804358c376deb1e18ef4916f12478151b218797916b40803897779b0d"

RPROVIDES:${PN} += "python3.11dist(pytaglib) \
python311-pytaglib \
python311-pytaglib(aarch-64) \
python3dist(pytaglib)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libtag.so.1()(64bit) \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
