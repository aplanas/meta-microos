SUMMARY = "Fish completion for swaylock"
DESCRIPTION = "Fish command line completion support for swaylock."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "swaylock-fish-completion-1.7.2-1.1.noarch.rpm"
RPM_HASH = "ea0ea70b9bcc6ee8f01b8ee77424a8b8989ec4c157fed128ae148ddff5c16892d29398f1ae5d1f639fd5197b9da15788436b476bb0ebeb73f430bd26cef30233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swaylock-fish-completion"

RDEPENDS:${PN} += "swaylock"

inherit rpm
