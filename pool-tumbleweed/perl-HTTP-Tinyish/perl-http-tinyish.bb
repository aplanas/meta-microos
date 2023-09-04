SUMMARY = "HTTP::Tiny compatible HTTP client wrappers"
DESCRIPTION = "HTTP::Tinyish is a wrapper module for HTTP client modules LWP, HTTP::Tiny \
and HTTP client software 'curl' and 'wget'. \
 \
It provides an API compatible to HTTP::Tiny, and the implementation has \
been extracted out of App::cpanminus. This module can be useful in a \
restrictive environment where you need to be able to download CPAN modules \
without an HTTPS support in built-in HTTP library."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18"

RPM_NAME = "perl-HTTP-Tinyish-0.18-1.6.noarch.rpm"
RPM_HASH = "107094a8f6bff803b98e5d594be55a50fec933a14e340ec3794364f1c893bb8f44e3f9b75090c6057dc320023cdf0b2d35945a5906b258971d30eed1027af3c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Tinyish \
perl-HTTP--Tinyish--Base \
perl-HTTP--Tinyish--Curl \
perl-HTTP--Tinyish--HTTPTiny \
perl-HTTP--Tinyish--LWP \
perl-HTTP--Tinyish--Wget \
perl-HTTP-Tinyish"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Which \
perl-HTTP--Tiny \
perl-IPC--Run3 \
perl-parent"

inherit rpm
