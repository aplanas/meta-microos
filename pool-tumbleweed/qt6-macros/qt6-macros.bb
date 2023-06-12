SUMMARY = "RPM macros for Qt6 packages"
DESCRIPTION = "This package provides macros which are used by Qt6 packages."
LICENSE = "MIT"

PV = "20221130"

RPM_NAME = "qt6-macros-20221130-1.1.aarch64.rpm"
RPM_HASH = "14282dabfc4e44183e1d49f87244bf120f908e20bfb166325da340dfc3e54c57c10f0fa2cbe952e9b72c5d3a49d31876c5aace5ca2039958a0f55dddf52054f2"

RPROVIDES:${PN} += "qt6-macros \
qt6-macros(aarch-64) \
rpm_macro(_qt6_archdatadir) \
rpm_macro(_qt6_bindir) \
rpm_macro(_qt6_cmakedir) \
rpm_macro(_qt6_datadir) \
rpm_macro(_qt6_descriptionsdir) \
rpm_macro(_qt6_docdir) \
rpm_macro(_qt6_examplesdir) \
rpm_macro(_qt6_importsdir) \
rpm_macro(_qt6_includedir) \
rpm_macro(_qt6_libdir) \
rpm_macro(_qt6_libexecdir) \
rpm_macro(_qt6_metatypesdir) \
rpm_macro(_qt6_mkspecsdir) \
rpm_macro(_qt6_pkgconfigdir) \
rpm_macro(_qt6_pluginsdir) \
rpm_macro(_qt6_prefix) \
rpm_macro(_qt6_qmldir) \
rpm_macro(_qt6_sharedir) \
rpm_macro(_qt6_sysconfdir) \
rpm_macro(_qt6_testsdir) \
rpm_macro(_qt6_translationsdir) \
rpm_macro(cmake_qt6) \
rpm_macro(qmake6) \
rpm_macro(qmake6_build) \
rpm_macro(qmake6_install) \
rpm_macro(qt6_build) \
rpm_macro(qt6_build_docs) \
rpm_macro(qt6_doc_packages) \
rpm_macro(qt6_docs_flavor) \
rpm_macro(qt6_examples_package) \
rpm_macro(qt6_install) \
rpm_macro(qt6_install_docs) \
rpm_macro(qt6_link_executables) \
rpm_macro(qt6_use_make)"
RDEPENDS:${PN} += "cmake \
ninja"

inherit rpm
