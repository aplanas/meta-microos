SUMMARY = "Legacy internal and client support for Menlo"
DESCRIPTION = "Menlo::Legacy is a package to install Menlo::CLI::Compat which is a \
compatibility library that implements the classic version of cpanminus \
internals and behavios. This is so that existing users of cpanm and API \
clients such as Carton, Carmel and App::cpm) can rely on the stable \
features and specific behaviors of cpanm. \
 \
This way Menlo can evolve and be refactored without the fear of breaking \
any downstream clients, including 'cpanm' itself."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.9022"

RPM_NAME = "perl-Menlo-Legacy-1.9022-1.12.noarch.rpm"
RPM_HASH = "a2da9efeaf664ce22ad9041868feba4102c9ff50d5bf70a91b15ac32973c96e1a8f1753acd00b40a3bebecfe2aaaa4ce05e3684944b5bd20e205231877ba1f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Menlo--CLI--Compat \
perl-Menlo--Legacy \
perl-Menlo-Legacy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Menlo \
perl-version"

inherit rpm
