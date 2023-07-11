SUMMARY = "PSGI Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains the PSGI plugin for running Perl applications that \
support the PSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-psgi-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "ef79909832077a0492b6d77406bfd858ae61e6473effb34658f89372e115e5fc88989dd1d25f457586aee2a7a0860f3c3062dd2019d3b16f91cc0dc5a82d7919"

RPROVIDES:${PN} += "uwsgi-psgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
uwsgi"

inherit rpm
