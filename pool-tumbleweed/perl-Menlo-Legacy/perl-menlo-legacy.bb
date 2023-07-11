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

RPM_NAME = "perl-Menlo-Legacy-1.9022-1.11.noarch.rpm"
RPM_HASH = "747a9e4104f32867b85a941a98e148f976bd3e051e23f9384f76d33c81c76baffb5c7a92124c172cede0b810a61d0e5fc8b8dd0a52ebea5f1d57ba3115eb4a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Menlo--CLI--Compat \
perl-Menlo--Legacy \
perl-Menlo-Legacy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Menlo \
perl-version"

inherit rpm
