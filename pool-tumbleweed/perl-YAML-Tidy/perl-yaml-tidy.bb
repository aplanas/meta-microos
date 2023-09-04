SUMMARY = "Tidy YAML files"
DESCRIPTION = "yamltidy can automatically tidy formatting in your YAML files, for example \
adjust indentation and remove trailing spaces. \
 \
For more information, see https://github.com/perlpunk/yamltidy."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-YAML-Tidy-0.007-1.3.noarch.rpm"
RPM_HASH = "28ae0ffddd8c911a759e1d508370a60683826579707af1bffd2e86a90c63bf40bcadc8b688488c685bfce130c454776241868db4d344a78a1becd6597fa4f1c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML--Tidy \
perl-YAML--Tidy--Config \
perl-YAML--Tidy--Node \
perl-YAML--Tidy--Node--Collection \
perl-YAML--Tidy--Node--Scalar \
perl-YAML-Tidy"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Getopt--Long--Descriptive \
perl-YAML--LibYAML--API \
perl-YAML--LibYAML--API--XS \
perl-YAML--PP--Common \
perl-YAML--PP--Highlight \
perl-YAML--PP--Parser \
perl-experimental"

inherit rpm
