SUMMARY = "Compile a log format string to perl-code"
DESCRIPTION = "Compile a log format string to perl-code. For faster generation of \
access_log lines."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.36"

RPM_NAME = "perl-Apache-LogFormat-Compiler-0.36-1.15.noarch.rpm"
RPM_HASH = "dc203eb5e941a1266ff6d7589322f5532b41c3bc5afec719fd6a25ecd974c1a261f4068d56f563a5217839a75a06a970e162609b8fce7f92d7f3938b47f83ebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--LogFormat--Compiler \
perl-Apache-LogFormat-Compiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-POSIX--strftime--Compiler"

inherit rpm
