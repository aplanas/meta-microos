SUMMARY = "Meta package for dependencies to build PicoRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build PicoRuby."
LICENSE = "MIT"

PV = "20230717"

RPM_NAME = "ruby-build-dependencies-picoruby-20230717-1.1.noarch.rpm"
RPM_HASH = "b48cc118191c56a8701952223951342bb9c1fd0a7d11cb14a002fa05edc44e48f9a1670f967cf41324033376adf03db7ac4a8482f80c7e0a6aa4b09845f0810a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-picoruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
