SUMMARY = "The required perl modules for razor-agents"
DESCRIPTION = "razor-agents are little programs to retrieve or update information \
from the razor <http://razor.sourceforge.net/> network to exchange \
signatures of SPAM. This package contains the required perl modules."
LICENSE = "Artistic-1.0"

PV = "2.86"

RPM_NAME = "perl-razor-agents-2.86-1.5.aarch64.rpm"
RPM_HASH = "6073ac5c19c3e20c8b8d64f852435bbe7991a92f67e748930d8c23de480064ec81abd6f911b6db47b9a9c8efa3036fca33e58315da66231ac5a8829fe7012afb"

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
