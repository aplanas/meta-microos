SUMMARY = "Models for GRUB2 configuration files"
DESCRIPTION = "Models allowing easy read and modification of GRUB2 configuration files. It is \
a plugin for cfa framework."
LICENSE = "LGPL-3.0-only"

PV = "2.0.0"

RPM_NAME = "ruby3.2-rubygem-cfa_grub2-2.0.0-1.17.aarch64.rpm"
RPM_HASH = "ed0f6967113ad868a073c681b5e067249067297b57dabcdf877fdc7f625c64dc2c9b421051e9b2c5d0b9b02739a36805d59c0dd3b019e600215397442af260e5"

RPROVIDES:${PN} += "ruby3.2-rubygem-cfa_grub2 \
ruby3.2-rubygem-cfa_grub2(aarch-64) \
rubygem(cfa_grub2) \
rubygem(ruby:3.2.0:cfa_grub2) \
rubygem(ruby:3.2.0:cfa_grub2:2) \
rubygem(ruby:3.2.0:cfa_grub2:2.0) \
rubygem(ruby:3.2.0:cfa_grub2:2.0.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:cfa:1)"

inherit rpm
