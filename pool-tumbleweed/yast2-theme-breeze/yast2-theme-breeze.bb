SUMMARY = "YaST2 - Breeze icon theme"
DESCRIPTION = "Contains icons in KDE Breeze style (from KDE Plasma 5)."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only & GPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-theme-breeze-4.6.0-1.2.noarch.rpm"
RPM_HASH = "a662e3f0c39c6a22739a10ec22ad2e09586d7cb644f3c251397d7e3600392b79aaa86bb76fa630a42062523e4e0ecadb2026e8d6f6837908ef179d9a8ee404c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-theme-breeze"

RDEPENDS:${PN} += "/usr/bin/bash \
breeze5-icons \
yast2-branding"

inherit rpm
