SUMMARY = "CLI components for Web::MEST-based applications"
DESCRIPTION = "Top-level module of the Web::MREST::CLI distribution. Exports some \
'generalized' functions that are used internally and might also be useful \
for writing CLI clients in general."
LICENSE = "BSD-3-Clause"

PV = "0.284"

RPM_NAME = "perl-Web-MREST-CLI-0.284-1.5.noarch.rpm"
RPM_HASH = "9d486f870af7af4c78348420ba69c2ade6a5dd6bed41c06912777682e179f3230f03b374e81e4628c3baf4dac3eaf7be89c76bbe34982ad742fd62030f222220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Web--MREST--CLI \
perl-Web--MREST--CLI--Parser \
perl-Web-MREST-CLI"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
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
