SUMMARY = "Meta package for dependencies to build PicoRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build PicoRuby."
LICENSE = "MIT"

PV = "20230512"

RPM_NAME = "ruby-build-dependencies-picoruby-20230512-1.1.noarch.rpm"
RPM_HASH = "9f3c4c4d3b03b35e18b01df9e97064ec08d70df209ceddc5e5886d5c8dc66339ffd22302a9648453d3789b98c718be00d682de42ce0d22e6c799d6d16fb78559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-picoruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
