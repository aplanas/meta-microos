SUMMARY = "Simple set-and-forget using of a '/share' directory in your projects root"
DESCRIPTION = "Simple set-and-forget using of a '/share' directory in your projects root"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.000009"

RPM_NAME = "perl-File-ShareDir-ProjectDistDir-1.000009-1.24.noarch.rpm"
RPM_HASH = "b451b121676331c1b3c18f1c1cd624b9f1b9d69643c21e794b5e190d88fad300df36f6cee3b8de7841791b65951db4042b1fd43e3a9d5c7c574a03ee5f68b8d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--ShareDir--ProjectDistDir \
perl-File-ShareDir-ProjectDistDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--ShareDir \
perl-Path--FindDev \
perl-Path--IsDev \
perl-Path--Tiny \
perl-Sub--Exporter"

inherit rpm
