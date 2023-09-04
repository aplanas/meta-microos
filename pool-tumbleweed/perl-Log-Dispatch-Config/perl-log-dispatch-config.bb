SUMMARY = "Log4j for Perl"
DESCRIPTION = "Log::Dispatch::Config is a subclass of Log::Dispatch and provides a way to \
configure Log::Dispatch object with configulation file (default, in \
AppConfig format). I mean, this is log4j for Perl, not with all API \
compatibility though."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Log-Dispatch-Config-1.04-9.27.noarch.rpm"
RPM_HASH = "754a064de05d2e6d13aa7191d9fb6934c3f14411d6d82c3448f37565e8773657405b7c342de1900be50199278c098783d378045b9f4d5e27aeb20265209eead9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Dispatch--Config \
perl-Log--Dispatch--Configurator \
perl-Log--Dispatch--Configurator--AppConfig \
perl-Log-Dispatch-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-AppConfig \
perl-File--Temp \
perl-IO--Scalar \
perl-Log--Dispatch \
perl-Test--More"

inherit rpm
