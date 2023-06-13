SUMMARY = "shift and scale time"
DESCRIPTION = "shift and scale time"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0.2"

RPM_NAME = "perl-Time-Mock-0.0.2-1.25.noarch.rpm"
RPM_HASH = "ac9b5c8bb15d28577ccb9d7cd6008bbb93ee6aa01badd21a4193e5bee224810b4aec772ca7974d8023b3348c226d15ea04779a7e0000fce27df06f28d5049f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Time::Mock) \
perl(Time::Mock::Original) \
perl-Time-Mock"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
