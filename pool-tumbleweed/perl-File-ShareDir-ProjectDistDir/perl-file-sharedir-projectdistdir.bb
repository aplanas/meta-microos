SUMMARY = "Simple set-and-forget using of a '/share' directory in your projects root"
DESCRIPTION = "Simple set-and-forget using of a '/share' directory in your projects root"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.000009"

RPM_NAME = "perl-File-ShareDir-ProjectDistDir-1.000009-1.25.noarch.rpm"
RPM_HASH = "1d6c3ac32db8709af6b18f6110719732045131e6cc95e3d4847397c12aa28ba2314b55c4a001d49249b55009f7c789d81d7ffbcfd8632405a9a8b35f224eb82d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--ShareDir--ProjectDistDir \
perl-File-ShareDir-ProjectDistDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--ShareDir \
perl-Path--FindDev \
perl-Path--IsDev \
perl-Path--Tiny \
perl-Sub--Exporter"

inherit rpm
