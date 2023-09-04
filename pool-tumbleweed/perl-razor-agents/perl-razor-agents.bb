SUMMARY = "The required perl modules for razor-agents"
DESCRIPTION = "razor-agents are little programs to retrieve or update information \
from the razor <http://razor.sourceforge.net/> network to exchange \
signatures of SPAM. This package contains the required perl modules."
LICENSE = "Artistic-1.0"

PV = "2.86"

RPM_NAME = "perl-razor-agents-2.86-1.6.aarch64.rpm"
RPM_HASH = "61472ab5fbef7eef3a4fd65e5057ae4329798d48bca188eaf7e58e21324b4fef0f995468e37907c5acf2a48ee8be1b40172ea1768a3567537457c6624076e144"

RPROVIDES:${PN} += "perl-Razor2--Client--Agent \
perl-Razor2--Client--Config \
perl-Razor2--Client--Core \
perl-Razor2--Client--Engine \
perl-Razor2--Client--Version \
perl-Razor2--Engine--VR8 \
perl-Razor2--Errorhandler \
perl-Razor2--Logger \
perl-Razor2--Preproc--Manager \
perl-Razor2--Preproc--deBase64 \
perl-Razor2--Preproc--deHTML \
perl-Razor2--Preproc--deHTML-comment \
perl-Razor2--Preproc--deHTMLxs \
perl-Razor2--Preproc--deNewline \
perl-Razor2--Preproc--deQP \
perl-Razor2--Preproc--enBase64 \
perl-Razor2--Signature--Ephemeral \
perl-Razor2--Signature--Whiplash \
perl-Razor2--String \
perl-Razor2--Syslog \
perl-razor-agents"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl-Digest-SHA1 \
perl-URI"

inherit rpm
