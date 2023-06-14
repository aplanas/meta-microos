SUMMARY = "PSGI Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains the PSGI plugin for running Perl applications that \
support the PSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-psgi-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "318606c104d90c51f7a47d612545431f0d3cf3a8b547b4d21f50f699b94ee0b6af2d0689c46b8ef7a7fbe5645d78b1a88d7a6fd8c5e61a3686ccc9909630547f"

RPROVIDES:${PN} += "uwsgi-psgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
uwsgi"

inherit rpm
