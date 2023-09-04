SUMMARY = "PSGI Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains the PSGI plugin for running Perl applications that \
support the PSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-psgi-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "ccb5078533b11b6cc4e3f44579e3a58a382530bcfc9fe082f03dbe5e04f1358e70ef7107f24de64969817ac2f57650e3752fee8f6ae77f0a88f94e9af1781752"

RPROVIDES:${PN} += "uwsgi-psgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
uwsgi"

inherit rpm
