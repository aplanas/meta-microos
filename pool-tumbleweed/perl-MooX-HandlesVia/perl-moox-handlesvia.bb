SUMMARY = "NativeTrait-like behavior for Moo"
DESCRIPTION = "MooX::HandlesVia is an extension of Moo's 'handles' attribute \
functionality. It provides a means of proxying functionality from an \
external class to the given atttribute. This is most commonly used as a way \
to emulate 'Native Trait' behavior that has become commonplace in Moose \
code, for which there was no Moo alternative."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001009"

RPM_NAME = "perl-MooX-HandlesVia-0.001009-1.13.noarch.rpm"
RPM_HASH = "724f9ee91e89fdd6176a9ac13818a7f5ce189a2f3d9fc5ce78b7ca65fbf8c9f4818ca5cef72afdc1aa541c3f54f09ebb6fcccc7e7b13ed57072bcd9e6929ad1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Perl--Bool--MooseLike \
perl-Data--Perl--Collection--Array--MooseLike \
perl-Data--Perl--Collection--Hash--MooseLike \
perl-Data--Perl--Number--MooseLike \
perl-Data--Perl--String--MooseLike \
perl-MooX--HandlesVia \
perl-MooX-HandlesVia"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Method--Modifiers \
perl-Data--Perl \
perl-Module--Runtime \
perl-Moo \
perl-Role--Tiny"

inherit rpm
