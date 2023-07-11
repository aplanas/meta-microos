SUMMARY = "Simple .ini-file format"
DESCRIPTION = "simple .ini-file format"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.029"

RPM_NAME = "perl-Config-INI-0.029-1.2.noarch.rpm"
RPM_HASH = "b1e5f0a336d555901275be117acb974bbcfdd36d5b22069dbba9e362dfd562941a739b100f5a7d5eb01eae911b22ad14462ff568a646d8f8a6d08c3743ba4684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--INI \
perl-Config--INI--Reader \
perl-Config--INI--Writer \
perl-Config-INI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Mixin--Linewise--Readers \
perl-Mixin--Linewise--Writers"

inherit rpm
