SUMMARY = "Tidy YAML files"
DESCRIPTION = "yamltidy can automatically tidy formatting in your YAML files, for example \
adjust indentation and remove trailing spaces. \
 \
For more information, see https://github.com/perlpunk/yamltidy."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-YAML-Tidy-0.007-1.2.noarch.rpm"
RPM_HASH = "c854af8783a8aa5d65fa6459338337fa7eaf3513a0b5fe48fc6e36dd81cd40c4a6253f773be5a325bedc979449f6c10b2f7cb37e44501949e03f6b17908c60e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML--Tidy \
perl-YAML--Tidy--Config \
perl-YAML--Tidy--Node \
perl-YAML--Tidy--Node--Collection \
perl-YAML--Tidy--Node--Scalar \
perl-YAML-Tidy"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Getopt--Long--Descriptive \
perl-YAML--LibYAML--API \
perl-YAML--LibYAML--API--XS \
perl-YAML--PP--Common \
perl-YAML--PP--Highlight \
perl-YAML--PP--Parser \
perl-experimental"

inherit rpm
