SUMMARY = "Set up a CGI environment from an HTTP::Request"
DESCRIPTION = "Provides a convenient way of setting up an CGI environment from an \
HTTP::Request."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.2"

RPM_NAME = "perl-HTTP-Request-AsCGI-1.2-13.25.noarch.rpm"
RPM_HASH = "11561f6a8b15cb9ad391e34b43ae55d3790d27dad3a88d65689d75ab25c8def4a1e5defd7b2bca43bc1017de8fb3eddfc1139b95492144fc77d35af4a46d5fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Request--AsCGI \
perl-HTTP-Request-AsCGI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Carp \
perl-Class--Accessor \
perl-HTTP--Request \
perl-HTTP--Response \
perl-IO--File \
perl-URI--Escape"

inherit rpm
