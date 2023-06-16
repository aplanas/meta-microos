SUMMARY = "Testing Module for YAML Implementations"
DESCRIPTION = "Test::YAML is a subclass of Test::Base with YAML specific support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.07"

RPM_NAME = "perl-Test-YAML-1.07-1.17.noarch.rpm"
RPM_HASH = "ded8170da99072dc27ce50425a59ae49c7acd0eebd36d6f1bbdf922f12e62006c31f04cbdca81a69aa77c5bd369a1472715ad5e9db8f9593fd89a0f2c93f47bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--YAML \
perl-Test--YAML--Filter \
perl-Test-YAML"

RDEPENDS:${PN} += "/usr/bin/bash \
perl--MODULE-COMPAT-5.36.0 \
perl-Test--Base"

inherit rpm
