SUMMARY = "Extra terminfo files for the foot terminal emulator"
DESCRIPTION = "This package contains extra terminfo files for the foot terminal emulator \
that provide more features than the files in the terminfo-base package. \
Set term=foot-extra or term=foot-extra-direct in foot.ini to \
take advantage of the files in this package."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "foot-extra-terminfo-1.14.0-4.1.noarch.rpm"
RPM_HASH = "aaa1f5478f287901cfda88acd66a9e2110df56d1890e69a53441e7feae622834ad3cf5e8ca7ac0bd8654d0dba93e82dc22d98d257682535c773bf8d906dd7a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-extra-terminfo"

RDEPENDS:${PN} += ""

inherit rpm
