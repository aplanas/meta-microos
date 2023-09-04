SUMMARY = "RPM Build Environment"
DESCRIPTION = "Minimal set of tools and libraries for building packages using the RPM package manager."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_rpm_build-20170319-12.1.aarch64.rpm"
RPM_HASH = "d777f297e3cf29fda9c6e94b9e2b7bfb5c0d294407e24fdd6a1c07becca15cf244698f37374081d6de45cf55500cfc6496aff13fa6a8fc010cfda78766aabed3"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-base-devel-rpm-build"

RDEPENDS:${PN} += "libnss-usrfiles2 \
man \
netcfg \
pattern- \
rpm-build"

inherit rpm
