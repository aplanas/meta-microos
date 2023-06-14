SUMMARY = "KF5 Directory Layout"
DESCRIPTION = "This package provides macros which are utilized with extra-cmake-modules' KDEInstallDirs."
LICENSE = "LGPL-2.1-or-later"

PV = "20220307"

RPM_NAME = "kf5-filesystem-20220307-2.2.aarch64.rpm"
RPM_HASH = "c70fa328583c448ec089e8d4bb7f4147393505edf3ba946592fc93326efc088ffa62e6f3bce1609810fcf0d5c898087c197bdaa272e8fcfc032e022de2d79a4d"

RPROVIDES:${PN} += "kf5-filesystem \
rpm-macro--kf5-applicationsdir \
rpm-macro--kf5-appsdir \
rpm-macro--kf5-appstreamdir \
rpm-macro--kf5-bindir \
rpm-macro--kf5-build-type \
rpm-macro--kf5-cmakedir \
rpm-macro--kf5-configdir \
rpm-macro--kf5-configkcfgdir \
rpm-macro--kf5-datadir \
rpm-macro--kf5-dbusinterfacesdir \
rpm-macro--kf5-dbuspolicydir \
rpm-macro--kf5-debugdir \
rpm-macro--kf5-htmldir \
rpm-macro--kf5-iconsdir \
rpm-macro--kf5-importdir \
rpm-macro--kf5-includedir \
rpm-macro--kf5-knsrcfilesdir \
rpm-macro--kf5-kxmlguidir \
rpm-macro--kf5-libdir \
rpm-macro--kf5-libexecdir \
rpm-macro--kf5-localedir \
rpm-macro--kf5-mandir \
rpm-macro--kf5-mkspecsdir \
rpm-macro--kf5-notifydir \
rpm-macro--kf5-plasmadir \
rpm-macro--kf5-plugindir \
rpm-macro--kf5-prefix \
rpm-macro--kf5-qmldir \
rpm-macro--kf5-sbindir \
rpm-macro--kf5-servicesdir \
rpm-macro--kf5-servicetypesdir \
rpm-macro--kf5-sharedir \
rpm-macro--kf5-sysconfdir \
rpm-macro--kf5-wallpapersdir \
rpm-macro-cmake-kf5 \
rpm-macro-create-exclude-filelist \
rpm-macro-create-subdir-filelist \
rpm-macro-kf5-find-htmldocs \
rpm-macro-kf5-find-lang \
rpm-macro-kf5-makeinstall \
rpm-macro-kf5-post-install \
rpm-macro-kf5-python-bindings-package \
rpm-macro-make-jobs"

RDEPENDS:${PN} += "/bin/bash \
hicolor-icon-theme"

inherit rpm
