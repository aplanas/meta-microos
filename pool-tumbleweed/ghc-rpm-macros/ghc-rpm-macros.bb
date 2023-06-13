SUMMARY = "RPM Macros for building packages for GHC"
DESCRIPTION = "A set of macros for building GHC packages following the openSUSE \
Haskell Guidelines.  ghc needs to be installed in \
order to make use of these macros."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.2"

RPM_NAME = "ghc-rpm-macros-2.5.2-1.1.noarch.rpm"
RPM_HASH = "a215fb13bb32942f6f8ab1a5ac1d828ed1d3feb4ec09341ac08777dcb273e059925346e8b5189982f6f06c8eb001d1c512edc0950a2d8eef2dd70ce0aac4d5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-rpm-macros \
rpm_macro(_ghc_doc_dir) \
rpm_macro(_ghcdocdir) \
rpm_macro(_ghclicensedir) \
rpm_macro(cabal) \
rpm_macro(cabal_build_options) \
rpm_macro(cabal_configure) \
rpm_macro(cabal_configure_options) \
rpm_macro(cabal_install) \
rpm_macro(cabal_install_options) \
rpm_macro(cabal_pkg_conf) \
rpm_macro(cabal_test) \
rpm_macro(cabal_test_options) \
rpm_macro(ghc_bin_build) \
rpm_macro(ghc_bin_install) \
rpm_macro(ghc_delete_rpaths) \
rpm_macro(ghc_fix_doc_perms) \
rpm_macro(ghc_fix_rpath) \
rpm_macro(ghc_gen_filelists) \
rpm_macro(ghc_html_dir) \
rpm_macro(ghc_html_libraries_dir) \
rpm_macro(ghc_html_pkg_dir) \
rpm_macro(ghc_lib_build) \
rpm_macro(ghc_lib_build_without_haddock) \
rpm_macro(ghc_lib_install) \
rpm_macro(ghc_merge_filelist) \
rpm_macro(ghc_pkg_recache) \
rpm_macro(ghc_pkgdocdir) \
rpm_macro(ghc_prefix) \
rpm_macro(ghc_quick_build) \
rpm_macro(ghc_set_gcc_flags) \
rpm_macro(ghc_smp_mflags) \
rpm_macro(ghc_suse_disable_debug_packages) \
rpm_macro(ghc_version) \
rpm_macro(ghc_without_dynamic) \
rpm_macro(ghcdocbasedir) \
rpm_macro(ghclibdir) \
rpm_macro(ghclibdocdir) \
rpm_macro(ghcliblib) \
rpm_macro(ghclibplatform) \
rpm_macro(ghcpkgdocdir) \
rpm_macro(ghcplatform) \
rpm_macro(with_ghc_prof) \
rpm_macro(with_haddock)"

RDEPENDS:${PN} += "/bin/sh \
chrpath \
rpm"

inherit rpm
