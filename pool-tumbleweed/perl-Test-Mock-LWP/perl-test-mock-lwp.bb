SUMMARY = "Easy mocking of LWP packages"
DESCRIPTION = "This package arises from duplicating the same code to mock LWP et al in \
several different modules I've written. This version is very minimalist, \
but works for my needs so far. I'm very open to new suggestions and \
improvements."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.08"

RPM_NAME = "perl-Test-Mock-LWP-0.08-4.20.noarch.rpm"
RPM_HASH = "85a96e13af55d350efa42f0ef5670d8b97db8473c1f9194c649630b4d56403885af4e02bbef95904412d2f7158be4e5309fd3184c60e4ed02fb78a6be8738f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Mock::HTTP::Request) \
perl(Test::Mock::HTTP::Response) \
perl(Test::Mock::LWP) \
perl(Test::Mock::LWP::UserAgent) \
perl-Test-Mock-LWP"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::MockObject)"

inherit rpm
