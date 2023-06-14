SUMMARY = "Log4j for Perl"
DESCRIPTION = "Log::Dispatch::Config is a subclass of Log::Dispatch and provides a way to \
configure Log::Dispatch object with configulation file (default, in \
AppConfig format). I mean, this is log4j for Perl, not with all API \
compatibility though."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Log-Dispatch-Config-1.04-9.25.noarch.rpm"
RPM_HASH = "3491a6416d04e818aaba2c3fa2c709edd16c9d47de528ae5489670dfff4a3f5242c530a25b332a100c2b482307e43b98f35f6d4977c632085cb28eda24bf8d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Dispatch--Config \
perl-Log--Dispatch--Configurator \
perl-Log--Dispatch--Configurator--AppConfig \
perl-Log-Dispatch-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-AppConfig \
perl-File--Temp \
perl-IO--Scalar \
perl-Log--Dispatch \
perl-Test--More"

inherit rpm
