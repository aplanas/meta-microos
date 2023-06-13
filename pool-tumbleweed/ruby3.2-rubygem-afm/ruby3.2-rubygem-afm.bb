SUMMARY = "reading Adobe Font Metrics (afm) files"
DESCRIPTION = "a simple library to read afm files and use the data conveniently."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ruby3.2-rubygem-afm-0.2.2-1.14.aarch64.rpm"
RPM_HASH = "ebc90929fea71ffa0c4c3f44636adf4944341a094d392352827219b5a0ccfe8345d50cd8b646283c1c2049734cfc26373b4168478c9ceaa0ac22271bb1f5651f"

RPROVIDES:${PN} += "ruby3.2-rubygem-afm \
ruby3.2-rubygem-afm(aarch-64) \
rubygem(afm) \
rubygem(ruby:3.2.0:afm) \
rubygem(ruby:3.2.0:afm:0) \
rubygem(ruby:3.2.0:afm:0.2) \
rubygem(ruby:3.2.0:afm:0.2.2)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
