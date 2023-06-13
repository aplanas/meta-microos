SUMMARY = "RPM macros for building cups drivers"
DESCRIPTION = "RPM helper scripts to create automatic 'Provides:' tags for printer \
driver RPMs."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "cups-rpm-helper-2.0.1-2.8.aarch64.rpm"
RPM_HASH = "8512cc90e4b6e91149710c14658f9054a992ed72f4280decedd5ef676dac9da9cd5cf7863658d876fa9be195d8092e6265d7ed5cf96e3c62ef058a7a5b0ffb32"

RPROVIDES:${PN} += "cups-rpm-helper \
cups-rpm-helper(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-cups \
rpm-build"

inherit rpm
