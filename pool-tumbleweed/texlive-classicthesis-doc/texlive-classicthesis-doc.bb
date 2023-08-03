SUMMARY = "Documentation for texlive-classicthesis"
DESCRIPTION = "This package includes the documentation for texlive-classicthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.6svn48041"

RPM_NAME = "texlive-classicthesis-doc-2023.209.4.6svn48041-54.1.noarch.rpm"
RPM_HASH = "f04dae5c662377a7702f00b2630c235482316dfc3fe34ab16af2f6b09bcb535dc6cd0daed47555b750ba2463088ff2743850b6a88b5696d7ac7ce3112cb52bf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-classicthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
