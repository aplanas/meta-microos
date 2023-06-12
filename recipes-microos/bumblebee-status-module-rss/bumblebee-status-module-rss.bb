SUMMARY = "Widget to display RSS feed"
DESCRIPTION = "Widget to display a RSS feed."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-rss-2.1.5-3.3.noarch.rpm"
RPM_HASH = "ddc0845423a6f46b2cd7a423d8e186f8d887d49fad425c83178a31ea391f5d08253ca68a8a978783d1e52ea3607dfbb70bda288443087eb4470a99b7ec6abdb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-rss"
RDEPENDS:${PN} += "bumblebee-status \
python3-feedparser"

inherit rpm
