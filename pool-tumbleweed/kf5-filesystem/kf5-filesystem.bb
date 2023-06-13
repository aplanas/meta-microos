SUMMARY = "KF5 Directory Layout"
DESCRIPTION = "This package provides macros which are utilized with extra-cmake-modules' KDEInstallDirs."
LICENSE = "LGPL-2.1-or-later"

PV = "20220307"

RPM_NAME = "kf5-filesystem-20220307-2.2.aarch64.rpm"
RPM_HASH = "c70fa328583c448ec089e8d4bb7f4147393505edf3ba946592fc93326efc088ffa62e6f3bce1609810fcf0d5c898087c197bdaa272e8fcfc032e022de2d79a4d"

RPROVIDES:${PN} += "kf5-filesystem \
kf5-filesystem(aarch-64) \
rpm_macro(_kf5_applicationsdir) \
rpm_macro(_kf5_appsdir) \
rpm_macro(_kf5_appstreamdir) \
rpm_macro(_kf5_bindir) \
rpm_macro(_kf5_build_type) \
rpm_macro(_kf5_cmakedir) \
rpm_macro(_kf5_configdir) \
rpm_macro(_kf5_configkcfgdir) \
rpm_macro(_kf5_datadir) \
rpm_macro(_kf5_dbusinterfacesdir) \
rpm_macro(_kf5_dbuspolicydir) \
rpm_macro(_kf5_debugdir) \
rpm_macro(_kf5_htmldir) \
rpm_macro(_kf5_iconsdir) \
rpm_macro(_kf5_importdir) \
rpm_macro(_kf5_includedir) \
rpm_macro(_kf5_knsrcfilesdir) \
rpm_macro(_kf5_kxmlguidir) \
rpm_macro(_kf5_libdir) \
rpm_macro(_kf5_libexecdir) \
rpm_macro(_kf5_localedir) \
rpm_macro(_kf5_mandir) \
rpm_macro(_kf5_mkspecsdir) \
rpm_macro(_kf5_notifydir) \
rpm_macro(_kf5_plasmadir) \
rpm_macro(_kf5_plugindir) \
rpm_macro(_kf5_prefix) \
rpm_macro(_kf5_qmldir) \
rpm_macro(_kf5_sbindir) \
rpm_macro(_kf5_servicesdir) \
rpm_macro(_kf5_servicetypesdir) \
rpm_macro(_kf5_sharedir) \
rpm_macro(_kf5_sysconfdir) \
rpm_macro(_kf5_wallpapersdir) \
rpm_macro(cmake_kf5) \
rpm_macro(create_exclude_filelist) \
rpm_macro(create_subdir_filelist) \
rpm_macro(kf5_find_htmldocs) \
rpm_macro(kf5_find_lang) \
rpm_macro(kf5_makeinstall) \
rpm_macro(kf5_post_install) \
rpm_macro(kf5_python_bindings_package) \
rpm_macro(make_jobs)"

RDEPENDS:${PN} += "/bin/bash \
hicolor-icon-theme"

inherit rpm
