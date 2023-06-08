SUMMARY = "Server for distributed C/C++ compilation"
DESCRIPTION = "This package contains the compilation server needed to use distcc."
LICENSE = "GPL-2.0-or-later"

PV = "3.4"

RPM_NAME = "distcc-server-3.4-5.4.aarch64.rpm"
RPM_HASH = "468a38f5ef487340de1a798a13676ee7d096a97eea52e0581c88041305b90c920717d66acd822c8a4152363d011607dd21dec13f471ebd07f542f8c75f25b191"

RPROVIDES:${PN} += "config(distcc-server) distcc-server distcc-server(aarch-64) python3.10dist(include-server) python3dist(include-server)"
RDEPENDS:${PN} += "/bin/sh distcc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) python(abi) systemd"

inherit rpm
