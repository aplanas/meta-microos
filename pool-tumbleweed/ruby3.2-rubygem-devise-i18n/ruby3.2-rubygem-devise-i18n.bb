SUMMARY = "Translations for the devise gem"
DESCRIPTION = "Translations for the devise gem."
LICENSE = "MIT"

PV = "1.10.2"

RPM_NAME = "ruby3.2-rubygem-devise-i18n-1.10.2-1.9.aarch64.rpm"
RPM_HASH = "d20101638b9b9b4e43c96d01b415ce003ecc7e2492ec78a495b2bfa408286448fcc06b69b84117b857023e7adb1c19d4990b28ad1fb52a5b139e07291ab08549"

RPROVIDES:${PN} += "ruby3.2-rubygem-devise-i18n \
ruby3.2-rubygem-devise-i18n(aarch-64) \
rubygem(devise-i18n) \
rubygem(ruby:3.2.0:devise-i18n) \
rubygem(ruby:3.2.0:devise-i18n:1) \
rubygem(ruby:3.2.0:devise-i18n:1.10) \
rubygem(ruby:3.2.0:devise-i18n:1.10.2)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:devise)"

inherit rpm
