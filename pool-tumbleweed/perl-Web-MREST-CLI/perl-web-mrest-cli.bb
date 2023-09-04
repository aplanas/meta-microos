SUMMARY = "CLI components for Web::MEST-based applications"
DESCRIPTION = "Top-level module of the Web::MREST::CLI distribution. Exports some \
'generalized' functions that are used internally and might also be useful \
for writing CLI clients in general."
LICENSE = "BSD-3-Clause"

PV = "0.284"

RPM_NAME = "perl-Web-MREST-CLI-0.284-1.6.noarch.rpm"
RPM_HASH = "4ae0f25105006afa551bcd1f2bae8a59925d5bc4b183a5179d3b0c607df9d1d9d3d80a6f85d7f50afedf49a430e7c914e684ed1863835baaeb5058a54e114748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Web--MREST--CLI \
perl-Web--MREST--CLI--Parser \
perl-Web-MREST-CLI"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-App--CELL \
perl-File--HomeDir \
perl-File--ShareDir \
perl-HTTP--Request--Common \
perl-JSON \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Log--Any--Adapter \
perl-Params--Validate \
perl-Test--Deep \
perl-Try--Tiny \
perl-URI--Escape"

inherit rpm
