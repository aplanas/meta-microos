SUMMARY = "Meta package for dependencies to build PicoRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build PicoRuby."
LICENSE = "MIT"

PV = "20230710"

RPM_NAME = "ruby-build-dependencies-picoruby-20230710-1.1.noarch.rpm"
RPM_HASH = "754c1ef55434de855b3a579e7e999a703f498cc3b796df059d1cf723f791d6007696aef697e3cde9241c680b61cb51e2021511fea3a5f456cff479d28deb04f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-picoruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
