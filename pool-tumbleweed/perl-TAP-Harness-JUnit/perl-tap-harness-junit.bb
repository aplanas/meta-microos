SUMMARY = "Generate JUnit compatible output from TAP results"
DESCRIPTION = "The only difference between this module and _TAP::Harness_ is that this \
module adds the optional arguments 'xmlfile', 'package', and 'namemangle' \
that cause the output to be formatted into XML in a format similar to the \
one that is produced by the JUnit testing framework."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.42"

RPM_NAME = "perl-TAP-Harness-JUnit-0.42-1.16.noarch.rpm"
RPM_HASH = "0ae1e573719c19f7bd75c8cb1fb61c2cbc6e86a1a257162e0b17bfa512ad96e584add0b7b2dac0943de44fbaad67b6bbc8100088befe39a50e5a5f9b81af5753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-TAP--Harness--JUnit \
perl-TAP--Harness--JUnit--Parser \
perl-TAP-Harness-JUnit"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-TAP--Harness \
perl-TAP--Parser \
perl-XML--Simple"

inherit rpm
