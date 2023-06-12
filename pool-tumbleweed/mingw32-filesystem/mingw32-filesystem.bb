SUMMARY = "MinGW base filesystem and environment"
DESCRIPTION = "This package contains the base filesystem layout, RPM macros and \
environment for all MinGW packages. \
 \
This environment is maintained by the Fedora MinGW SIG at: \
 \
  http://fedoraproject.org/wiki/SIGs/MinGW"
LICENSE = "GPL-2.0-or-later"

PV = "20230401"

RPM_NAME = "mingw32-filesystem-20230401-1.1.noarch.rpm"
RPM_HASH = "46eb6080e00de3ffae6943e0ef9c2c522c2c05b368bc7a6d7e1d575dc576879bf7de2e1d0620f7ee2c2e000efa999770a0b58602f0704153e54742e1b3f28cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(bcrypt.dll) \
mingw32(d2d1.dll) \
mingw32(d3d11.dll) \
mingw32(d3d12.dll) \
mingw32(dbghelp.dll) \
mingw32(dcomp.dll) \
mingw32(dwrite.dll) \
mingw32(dxgi.dll) \
mingw32(mpr.dll) \
mingw32(ncrypt.dll) \
mingw32(odbccp32.dll) \
mingw32(userenv.dll) \
mingw32(uxtheme.dll) \
mingw32(wtsapi32.dll) \
mingw32-filesystem \
rpm_macro(_mingw32_addr2line) \
rpm_macro(_mingw32_ar) \
rpm_macro(_mingw32_as) \
rpm_macro(_mingw32_bindir) \
rpm_macro(_mingw32_cache) \
rpm_macro(_mingw32_cc) \
rpm_macro(_mingw32_cflags) \
rpm_macro(_mingw32_classpath) \
rpm_macro(_mingw32_configure) \
rpm_macro(_mingw32_cpp) \
rpm_macro(_mingw32_cpu) \
rpm_macro(_mingw32_create_macro_links) \
rpm_macro(_mingw32_cxx) \
rpm_macro(_mingw32_cxxflags) \
rpm_macro(_mingw32_datadir) \
rpm_macro(_mingw32_debug_install_post) \
rpm_macro(_mingw32_debug_package) \
rpm_macro(_mingw32_dlltool) \
rpm_macro(_mingw32_dllwrap) \
rpm_macro(_mingw32_docdir) \
rpm_macro(_mingw32_env) \
rpm_macro(_mingw32_exec_prefix) \
rpm_macro(_mingw32_fc) \
rpm_macro(_mingw32_find_lang) \
rpm_macro(_mingw32_gcj) \
rpm_macro(_mingw32_gcov) \
rpm_macro(_mingw32_gdb) \
rpm_macro(_mingw32_gprof) \
rpm_macro(_mingw32_host) \
rpm_macro(_mingw32_includedir) \
rpm_macro(_mingw32_infodir) \
rpm_macro(_mingw32_install_post) \
rpm_macro(_mingw32_ld) \
rpm_macro(_mingw32_ldflags) \
rpm_macro(_mingw32_ldflags_base) \
rpm_macro(_mingw32_ldflags_bootstrap) \
rpm_macro(_mingw32_libdir) \
rpm_macro(_mingw32_libexecdir) \
rpm_macro(_mingw32_localstatedir) \
rpm_macro(_mingw32_make) \
rpm_macro(_mingw32_make_install) \
rpm_macro(_mingw32_makeinstall) \
rpm_macro(_mingw32_mandir) \
rpm_macro(_mingw32_nm) \
rpm_macro(_mingw32_objcopy) \
rpm_macro(_mingw32_objdump) \
rpm_macro(_mingw32_os) \
rpm_macro(_mingw32_package_header) \
rpm_macro(_mingw32_package_header_debug) \
rpm_macro(_mingw32_prefix) \
rpm_macro(_mingw32_ranlib) \
rpm_macro(_mingw32_readelf) \
rpm_macro(_mingw32_sbindir) \
rpm_macro(_mingw32_sharedstatedir) \
rpm_macro(_mingw32_size) \
rpm_macro(_mingw32_strings) \
rpm_macro(_mingw32_strip) \
rpm_macro(_mingw32_sysconfdir) \
rpm_macro(_mingw32_sysroot) \
rpm_macro(_mingw32_target) \
rpm_macro(_mingw32_vendor) \
rpm_macro(_mingw32_windmc) \
rpm_macro(_mingw32_windres)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
findutils \
gawk \
grep \
mingw32-cross-binutils-utils \
mingw32-cross-pkgconf-utils \
python3 \
rpm \
rpmlint-mini \
sed"

inherit rpm
