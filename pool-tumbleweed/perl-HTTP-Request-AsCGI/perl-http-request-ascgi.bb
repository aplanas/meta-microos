SUMMARY = "Set up a CGI environment from an HTTP::Request"
DESCRIPTION = "Provides a convenient way of setting up an CGI environment from an \
HTTP::Request."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.2"

RPM_NAME = "perl-HTTP-Request-AsCGI-1.2-13.26.noarch.rpm"
RPM_HASH = "d2211f9c9717d7b6e63a19726ff9707fd65b01fd202c1edf64867571e5bb7475af8277a64f618e91131142303c82791788ab344f13962d8c94a3f0de93f60214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Request--AsCGI \
perl-HTTP-Request-AsCGI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp \
perl-Class--Accessor \
perl-HTTP--Request \
perl-HTTP--Response \
perl-IO--File \
perl-URI--Escape"

inherit rpm
