SUMMARY = "Contextual Tests That the Harness Can Ignore"
DESCRIPTION = "contextual tests that the harness can ignore"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-Module-Install-ExtraTests-0.008-6.22.noarch.rpm"
RPM_HASH = "781227507cb182ec90aa11d2abb28b90287c58b7c10609c88629f36097004003533dcd94533dfef0dabac071e00d32d6c7440eb000d4a834692ff2e20339a42d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Install--ExtraTests \
perl-Module-Install-ExtraTests"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
