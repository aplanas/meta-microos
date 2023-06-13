SUMMARY = "Binary files of clojure-pamphlet"
DESCRIPTION = "Binary files of clojure-pamphlet"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn51944"

RPM_NAME = "texlive-clojure-pamphlet-bin-2023.20230311.svn51944-91.1.aarch64.rpm"
RPM_HASH = "4e4e2c5d280c39285da92d4e8c2ede30d6513abb62ffa72c2213a44ba1b6630fe58605e5ba611de82ee8efcdaa4fc63f2357374adc5f9e7c31bc15381793dec7"

RPROVIDES:${PN} += "texlive-clojure-pamphlet-bin \
texlive-clojure-pamphlet-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-clojure-pamphlet"

inherit rpm
