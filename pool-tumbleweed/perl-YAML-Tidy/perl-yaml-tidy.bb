SUMMARY = "Tidy YAML files"
DESCRIPTION = "yamltidy can automatically tidy formatting in your YAML files, for example \
adjust indentation and remove trailing spaces. \
 \
For more information, see https://github.com/perlpunk/yamltidy."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-YAML-Tidy-0.007-1.1.noarch.rpm"
RPM_HASH = "fd277a206141ffe005938c97d4992e0ec9e6f9a11867788bf20000c0522534946d5d30cfda9ade47edc43b2d705cffff99ba22a372623c2a8e230c7f4627c97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(YAML::Tidy) \
perl(YAML::Tidy::Config) \
perl(YAML::Tidy::Node) \
perl(YAML::Tidy::Node::Collection) \
perl(YAML::Tidy::Node::Scalar) \
perl-YAML-Tidy"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Getopt::Long::Descriptive) \
perl(YAML::LibYAML::API) \
perl(YAML::LibYAML::API::XS) \
perl(YAML::PP::Common) \
perl(YAML::PP::Highlight) \
perl(YAML::PP::Parser) \
perl(experimental)"

inherit rpm
