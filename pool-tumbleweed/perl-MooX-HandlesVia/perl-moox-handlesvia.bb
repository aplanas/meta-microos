SUMMARY = "NativeTrait-like behavior for Moo"
DESCRIPTION = "MooX::HandlesVia is an extension of Moo's 'handles' attribute \
functionality. It provides a means of proxying functionality from an \
external class to the given atttribute. This is most commonly used as a way \
to emulate 'Native Trait' behavior that has become commonplace in Moose \
code, for which there was no Moo alternative."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001009"

RPM_NAME = "perl-MooX-HandlesVia-0.001009-1.14.noarch.rpm"
RPM_HASH = "c293bdbb038cff9e3ee0e44537546273671933179f3f2b3f01e88467fab5c8565191d2b6752366e06338e260f0ac674504f859d5c4d27eaea11b0e6ea592fbbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Perl--Bool--MooseLike \
perl-Data--Perl--Collection--Array--MooseLike \
perl-Data--Perl--Collection--Hash--MooseLike \
perl-Data--Perl--Number--MooseLike \
perl-Data--Perl--String--MooseLike \
perl-MooX--HandlesVia \
perl-MooX-HandlesVia"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Method--Modifiers \
perl-Data--Perl \
perl-Module--Runtime \
perl-Moo \
perl-Role--Tiny"

inherit rpm
