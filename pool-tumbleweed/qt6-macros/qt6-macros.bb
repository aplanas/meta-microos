SUMMARY = "RPM macros for Qt6 packages"
DESCRIPTION = "This package provides macros which are used by Qt6 packages."
LICENSE = "MIT"

PV = "20230629"

RPM_NAME = "qt6-macros-20230629-1.1.aarch64.rpm"
RPM_HASH = "32dc1a2848724f247b22cf049dd5f3a22e3dc48855d116585eead2c769a8c1027da8a3cd5f84674826daa05f5d762bd3ff6aa8abe12a24ee008968606d2c24ea"

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
