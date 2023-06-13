SUMMARY = "Cut-and-Paste-Detector for Perl code"
DESCRIPTION = "The module's main purpose is to report repeated text fragments (typically \
Perl code) that could be considered for isolation and/or abstraction in \
order to reduce multiple copies of the same code (aka cut and paste code)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10"

RPM_NAME = "perl-Code-DRY-0.10-1.22.aarch64.rpm"
RPM_HASH = "bec6fe8cb5c9fe76933defe6d51ced03b6885c645f979bf15fe898d12e04e5c038d0f7cf2eaeaabc88950c0798c9c7cb93305aa257502a420d32da1e2fe054ff"

RPROVIDES:${PN} += "perl(Code::DRY) \
perl-Code-DRY \
perl-Code-DRY(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(ExtUtils::CBuilder) \
perl(Module::Build) \
perl(TAP::Harness)"

inherit rpm
