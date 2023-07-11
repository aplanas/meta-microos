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

RPM_NAME = "perl-HTTP-Tinyish-0.18-1.5.noarch.rpm"
RPM_HASH = "1a2775d6186b8c692719772d9e83fc05b5d9a89fdfbe7c8c84249d9c5e7d5ff692a35612fb9a0e53d02ba24a107a3dd1311a94bea7a403a650bb1fc730161706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Tinyish \
perl-HTTP--Tinyish--Base \
perl-HTTP--Tinyish--Curl \
perl-HTTP--Tinyish--HTTPTiny \
perl-HTTP--Tinyish--LWP \
perl-HTTP--Tinyish--Wget \
perl-HTTP-Tinyish"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Which \
perl-HTTP--Tiny \
perl-IPC--Run3 \
perl-parent"

inherit rpm
