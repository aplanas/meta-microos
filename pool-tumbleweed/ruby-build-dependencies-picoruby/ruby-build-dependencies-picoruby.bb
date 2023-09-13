SUMMARY = "Meta package for dependencies to build PicoRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build PicoRuby."
LICENSE = "MIT"

PV = "20230904"

RPM_NAME = "ruby-build-dependencies-picoruby-20230904-1.1.noarch.rpm"
RPM_HASH = "2098581570a99d0636ebfa8bc2df1d5ae2752b16bcb311b0d2b8c281fdde207f471dae9ce2ae69b427cbc4dc88f3a7cab477926707f80e194a4043d9dde16b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-picoruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
