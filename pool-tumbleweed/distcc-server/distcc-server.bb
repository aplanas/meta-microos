SUMMARY = "Server for distributed C/C++ compilation"
DESCRIPTION = "This package contains the compilation server needed to use distcc."
LICENSE = "GPL-2.0-or-later"

PV = "3.4"

RPM_NAME = "distcc-server-3.4-5.4.aarch64.rpm"
RPM_HASH = "468a38f5ef487340de1a798a13676ee7d096a97eea52e0581c88041305b90c920717d66acd822c8a4152363d011607dd21dec13f471ebd07f542f8c75f25b191"

RPROVIDES:${PN} += "config-distcc-server \
distcc-server \
python3.10dist-include-server \
python3dist-include-server"

RDEPENDS:${PN} += "/bin/sh \
distcc \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
systemd"

inherit rpm
