SUMMARY = "Easy mocking of LWP packages"
DESCRIPTION = "This package arises from duplicating the same code to mock LWP et al in \
several different modules I've written. This version is very minimalist, \
but works for my needs so far. I'm very open to new suggestions and \
improvements."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.08"

RPM_NAME = "perl-Test-Mock-LWP-0.08-4.21.noarch.rpm"
RPM_HASH = "2085d010828890256d3b9a86847ee53249a194c19b440b547ae31be630ed9e1f62fd54a2acfba96d301adfcb121bfc7e8f0ead821793f50d8d3f1a1983b83eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mock--HTTP--Request \
perl-Test--Mock--HTTP--Response \
perl-Test--Mock--LWP \
perl-Test--Mock--LWP--UserAgent \
perl-Test-Mock-LWP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--MockObject"

inherit rpm
