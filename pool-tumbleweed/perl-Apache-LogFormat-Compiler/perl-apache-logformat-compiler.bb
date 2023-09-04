SUMMARY = "Compile a log format string to perl-code"
DESCRIPTION = "Compile a log format string to perl-code. For faster generation of \
access_log lines."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.36"

RPM_NAME = "perl-Apache-LogFormat-Compiler-0.36-1.17.noarch.rpm"
RPM_HASH = "0f18b88ee8682b548a35e9b20aad9622ecef38054dd9bff06254558e6df7ec4f8d010672cd6ab60792e29d8d44e2fa48c678a504ba388ed5fa476f1c7d45dc9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--LogFormat--Compiler \
perl-Apache-LogFormat-Compiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-POSIX--strftime--Compiler"

inherit rpm
