SUMMARY = "Fish completion for herbstluftwm"
DESCRIPTION = "Fish completion for herbstclient"
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-fish-completion-0.9.5-1.5.noarch.rpm"
RPM_HASH = "769bee987f7f8422228805be60c30059fe9da66a2246597d98738cddb1b8889ecd36e30ead549d2093093975a39b91f72ebefcd29f6905ad7df8599839161981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-fish-completion"

RDEPENDS:${PN} += "herbstluftwm"

inherit rpm
