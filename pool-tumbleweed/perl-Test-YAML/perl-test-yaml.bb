SUMMARY = "Testing Module for YAML Implementations"
DESCRIPTION = "Test::YAML is a subclass of Test::Base with YAML specific support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.07"

RPM_NAME = "perl-Test-YAML-1.07-1.18.noarch.rpm"
RPM_HASH = "5ad423b6ed139efe3610485e3fc2304332f46d0220a45833a36c2a096eb838eb4f37825b27652aeeee8483ed9c93c3c2e6ae28ff62906623d4d5e1e040b8c643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--YAML \
perl-Test--YAML--Filter \
perl-Test-YAML"

RDEPENDS:${PN} += "/usr/bin/bash \
perl--MODULE-COMPAT-5.36.1 \
perl-Test--Base"

inherit rpm
