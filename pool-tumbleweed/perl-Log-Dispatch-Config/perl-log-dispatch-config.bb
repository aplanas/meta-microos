SUMMARY = "Log4j for Perl"
DESCRIPTION = "Log::Dispatch::Config is a subclass of Log::Dispatch and provides a way to \
configure Log::Dispatch object with configulation file (default, in \
AppConfig format). I mean, this is log4j for Perl, not with all API \
compatibility though."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Log-Dispatch-Config-1.04-9.26.noarch.rpm"
RPM_HASH = "07e2e01b6b7e40406d72fd44c6b56540fcade23eeb1d0ee6aac4997970dbe9d8965b13ee5cbb0abdff70b95d895fc2179d12a9f740f5dadaf805efe7b93f4245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Dispatch--Config \
perl-Log--Dispatch--Configurator \
perl-Log--Dispatch--Configurator--AppConfig \
perl-Log-Dispatch-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-AppConfig \
perl-File--Temp \
perl-IO--Scalar \
perl-Log--Dispatch \
perl-Test--More"

inherit rpm
