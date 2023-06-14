SUMMARY = "RPM macros for Qt6 packages"
DESCRIPTION = "This package provides macros which are used by Qt6 packages."
LICENSE = "MIT"

PV = "20221130"

RPM_NAME = "qt6-macros-20221130-1.1.aarch64.rpm"
RPM_HASH = "14282dabfc4e44183e1d49f87244bf120f908e20bfb166325da340dfc3e54c57c10f0fa2cbe952e9b72c5d3a49d31876c5aace5ca2039958a0f55dddf52054f2"

RPROVIDES:${PN} += "qt6-macros \
rpm-macro--qt6-archdatadir \
rpm-macro--qt6-bindir \
rpm-macro--qt6-cmakedir \
rpm-macro--qt6-datadir \
rpm-macro--qt6-descriptionsdir \
rpm-macro--qt6-docdir \
rpm-macro--qt6-examplesdir \
rpm-macro--qt6-importsdir \
rpm-macro--qt6-includedir \
rpm-macro--qt6-libdir \
rpm-macro--qt6-libexecdir \
rpm-macro--qt6-metatypesdir \
rpm-macro--qt6-mkspecsdir \
rpm-macro--qt6-pkgconfigdir \
rpm-macro--qt6-pluginsdir \
rpm-macro--qt6-prefix \
rpm-macro--qt6-qmldir \
rpm-macro--qt6-sharedir \
rpm-macro--qt6-sysconfdir \
rpm-macro--qt6-testsdir \
rpm-macro--qt6-translationsdir \
rpm-macro-cmake-qt6 \
rpm-macro-qmake6 \
rpm-macro-qmake6-build \
rpm-macro-qmake6-install \
rpm-macro-qt6-build \
rpm-macro-qt6-build-docs \
rpm-macro-qt6-doc-packages \
rpm-macro-qt6-docs-flavor \
rpm-macro-qt6-examples-package \
rpm-macro-qt6-install \
rpm-macro-qt6-install-docs \
rpm-macro-qt6-link-executables \
rpm-macro-qt6-use-make"

RDEPENDS:${PN} += "cmake \
ninja"

inherit rpm
