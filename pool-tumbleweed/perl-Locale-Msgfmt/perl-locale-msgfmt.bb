SUMMARY = "Compile .po files to .mo files"
DESCRIPTION = "Compile .po files to .mo files"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Locale-Msgfmt-0.15-8.22.noarch.rpm"
RPM_HASH = "e8221aa4adbedd5904488e31e6d6e767ebd1ba0a398ee0915cdc8014957005c10d2fe7295c270edf10fb53716e121a367517fa4fa413fc2b5d6cdd1f41b951b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--Msgfmt \
perl-Locale--Msgfmt--Utils \
perl-Locale--Msgfmt--mo \
perl-Locale--Msgfmt--po \
perl-Locale-Msgfmt \
perl-Module--Install--Msgfmt"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
