SUMMARY = "Compile a log format string to perl-code"
DESCRIPTION = "Compile a log format string to perl-code. For faster generation of \
access_log lines."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.36"

RPM_NAME = "perl-Apache-LogFormat-Compiler-0.36-1.16.noarch.rpm"
RPM_HASH = "6e5d86c2a7287d8b8267d19fe0b10a3231792df3a13859b2095644fab941b6bb91d9222f82fdae71e834ec86eb99e21c987a149b36c306da6033861c77fe4d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--LogFormat--Compiler \
perl-Apache-LogFormat-Compiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-POSIX--strftime--Compiler"

inherit rpm
