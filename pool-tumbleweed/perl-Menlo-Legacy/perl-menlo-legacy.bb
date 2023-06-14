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

RPM_NAME = "perl-Menlo-Legacy-1.9022-1.10.noarch.rpm"
RPM_HASH = "970e96be59bb9f738fdc36ef78dbb69784559ab7786f3323096b9d1711dc16339fedc432de45f5c017f0e72df953977d34b627d2345a97c252b9c6ea5faca124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Menlo--CLI--Compat \
perl-Menlo--Legacy \
perl-Menlo-Legacy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Menlo \
perl-version"

inherit rpm
