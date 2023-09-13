SUMMARY = "Translation of man pages in Brazilian Portuguese"
DESCRIPTION = "This package provides translations of man pages in Brazilian Portuguese."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-pt_BR-4.20.0-1.1.noarch.rpm"
RPM_HASH = "30ddd9ac4a4511ca261cfa25b4790d5e94cd9ba95fe9a06727145160b6f42c0b2dfe9ca46041ddfc99d77fbdc35d3a4d93d5cc988eb4c42a69a6162438ccd561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-pt-BR \
man-pages-pt-BR"

RDEPENDS:${PN} += "man-pages"

inherit rpm
