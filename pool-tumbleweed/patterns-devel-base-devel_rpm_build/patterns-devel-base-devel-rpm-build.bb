SUMMARY = "RPM Build Environment"
DESCRIPTION = "Minimal set of tools and libraries for building packages using the RPM package manager."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_rpm_build-20170319-11.2.aarch64.rpm"
RPM_HASH = "dcfb07f458ce0011d436ced6000b81fe000fb28abf573a4f1161b2d7a0976a48baa4542fbc8f6e06c386c5b6aa099d90b11615cd6eb800f94d17d6bc2b0e6649"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-devel-base-devel_rpm_build \
patterns-devel-base-devel_rpm_build(aarch-64)"
RDEPENDS:${PN} += "libnss_usrfiles2 \
man \
netcfg \
pattern() \
rpm-build"

inherit rpm
