SUMMARY = "Generate JUnit compatible output from TAP results"
DESCRIPTION = "The only difference between this module and _TAP::Harness_ is that this \
module adds the optional arguments 'xmlfile', 'package', and 'namemangle' \
that cause the output to be formatted into XML in a format similar to the \
one that is produced by the JUnit testing framework."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.42"

RPM_NAME = "perl-TAP-Harness-JUnit-0.42-1.17.noarch.rpm"
RPM_HASH = "9d38f68932048cd7a97c609267326047622cc1c38f0d59190d5a836e396590f018284802ebdd08a7836db1fd10f9398a78831c425ab3f4df265155727d8f85aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-TAP--Harness--JUnit \
perl-TAP--Harness--JUnit--Parser \
perl-TAP-Harness-JUnit"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-TAP--Harness \
perl-TAP--Parser \
perl-XML--Simple"

inherit rpm
