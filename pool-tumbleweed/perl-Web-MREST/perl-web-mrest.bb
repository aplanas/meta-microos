SUMMARY = "Minimalistic REST server"
DESCRIPTION = "MREST stands for 'minimalistic' or 'mechanical' REST server. (Mechanical \
because it relies on Web::Machine.) \
 \
Web::MREST provides a fully functional REST server that can be started with \
a simple command. Without modification, the server provides a set of \
generalized resources that can be used to demonstrate how the REST server \
works, or for testing. \
 \
Developers can use Web::MREST as a platform for implementing their own REST \
servers, as described below. App::Dochazka::REST is a 'real-world' example \
of such a server. \
 \
For an introduction to REST and Web Services, see \
Web::MREST::WebServicesIntro."
LICENSE = "BSD-3-Clause"

PV = "0.288"

RPM_NAME = "perl-Web-MREST-0.288-1.21.noarch.rpm"
RPM_HASH = "15fef09a0de1129158f87cbb0701757e59a50c6403907c19325586863d94558738433da917d718934ac6decd4611689b5a2e5dedf2378c62e79805c3531a0abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Web--MREST \
perl-Web--MREST--Dispatch \
perl-Web--MREST--Entity \
perl-Web--MREST--InitRouter \
perl-Web--MREST--Resource \
perl-Web--MREST--Test \
perl-Web--MREST--Test--503 \
perl-Web--MREST--Test--Forbidden \
perl-Web--MREST--Test--Unauthorized \
perl-Web--MREST--Util \
perl-Web--MREST--WebServicesIntro \
perl-Web-MREST"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl--MODULE-COMPAT-5.38.0 \
perl-App--CELL \
perl-File--ShareDir \
perl-HTTP--Request \
perl-HTTP--Request--Common \
perl-JSON \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Module--Runtime \
perl-Params--Validate \
perl-Path--Router \
perl-Plack--Middleware--LogErrors \
perl-Plack--Middleware--Session \
perl-Plack--Middleware--StackTrace \
perl-Plack--Runner \
perl-Pod--Simple--HTML \
perl-Pod--Simple--Text \
perl-Test--Deep--NoTest \
perl-Try--Tiny \
perl-URI--Escape \
perl-Web--MREST--CLI \
perl-Web--Machine"

inherit rpm
