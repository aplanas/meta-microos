SUMMARY = "Meta package for dependencies to build JRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build JRuby."
LICENSE = "MIT"

PV = "20230710"

RPM_NAME = "ruby-build-dependencies-jruby-20230710-1.1.noarch.rpm"
RPM_HASH = "316f3a1336f75413c6cf27a168c514cf4cbdb8ce5f6a5d9c485e9d00896556307550f709ccf65e63cff8da1de2f4cd88982bc3d8a0c36434e41b3e2bdc491126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-jruby"

RDEPENDS:${PN} += "gcc-c++"

inherit rpm
