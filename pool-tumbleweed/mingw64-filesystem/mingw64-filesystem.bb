SUMMARY = "MinGW base filesystem and environment"
DESCRIPTION = "This package contains the base filesystem layout, RPM macros and \
environment for all MinGW packages. \
 \
This environment is maintained by the Fedora MinGW SIG at: \
 \
  http://fedoraproject.org/wiki/SIGs/MinGW"
LICENSE = "GPL-2.0-or-later"

PV = "20230614"

RPM_NAME = "mingw64-filesystem-20230614-1.1.noarch.rpm"
RPM_HASH = "c10fb1e07787e2ec8789a58c7973ad103ffb53b231231e0efba7ed2d4e15fe6a7b58a8edc7596bffd668e8260f252699877f122b8bcf61209a82def2dc0eaaea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-bcrypt.dll \
mingw64-d2d1.dll \
mingw64-d3d11.dll \
mingw64-d3d12.dll \
mingw64-dbghelp.dll \
mingw64-dcomp.dll \
mingw64-dwrite.dll \
mingw64-dxgi.dll \
mingw64-filesystem \
mingw64-mpr.dll \
mingw64-ncrypt.dll \
mingw64-odbccp32.dll \
mingw64-userenv.dll \
mingw64-uxtheme.dll \
mingw64-wtsapi32.dll \
rpm-macro--mingw64-addr2line \
rpm-macro--mingw64-ar \
rpm-macro--mingw64-as \
rpm-macro--mingw64-bindir \
rpm-macro--mingw64-cache \
rpm-macro--mingw64-cc \
rpm-macro--mingw64-cflags \
rpm-macro--mingw64-classpath \
rpm-macro--mingw64-configure \
rpm-macro--mingw64-cpp \
rpm-macro--mingw64-cpu \
rpm-macro--mingw64-create-macro-links \
rpm-macro--mingw64-cxx \
rpm-macro--mingw64-cxxflags \
rpm-macro--mingw64-datadir \
rpm-macro--mingw64-debug-install-post \
rpm-macro--mingw64-debug-package \
rpm-macro--mingw64-dlltool \
rpm-macro--mingw64-dllwrap \
rpm-macro--mingw64-docdir \
rpm-macro--mingw64-env \
rpm-macro--mingw64-exec-prefix \
rpm-macro--mingw64-fc \
rpm-macro--mingw64-find-lang \
rpm-macro--mingw64-gcj \
rpm-macro--mingw64-gcov \
rpm-macro--mingw64-gdb \
rpm-macro--mingw64-gprof \
rpm-macro--mingw64-host \
rpm-macro--mingw64-includedir \
rpm-macro--mingw64-infodir \
rpm-macro--mingw64-install-post \
rpm-macro--mingw64-ld \
rpm-macro--mingw64-ldflags \
rpm-macro--mingw64-ldflags-base \
rpm-macro--mingw64-ldflags-bootstrap \
rpm-macro--mingw64-libdir \
rpm-macro--mingw64-libexecdir \
rpm-macro--mingw64-localstatedir \
rpm-macro--mingw64-make \
rpm-macro--mingw64-make-install \
rpm-macro--mingw64-makeinstall \
rpm-macro--mingw64-mandir \
rpm-macro--mingw64-nm \
rpm-macro--mingw64-objcopy \
rpm-macro--mingw64-objdump \
rpm-macro--mingw64-os \
rpm-macro--mingw64-package-header \
rpm-macro--mingw64-package-header-debug \
rpm-macro--mingw64-prefix \
rpm-macro--mingw64-ranlib \
rpm-macro--mingw64-readelf \
rpm-macro--mingw64-sbindir \
rpm-macro--mingw64-sharedstatedir \
rpm-macro--mingw64-size \
rpm-macro--mingw64-strings \
rpm-macro--mingw64-strip \
rpm-macro--mingw64-sysconfdir \
rpm-macro--mingw64-sysroot \
rpm-macro--mingw64-target \
rpm-macro--mingw64-vendor \
rpm-macro--mingw64-windmc \
rpm-macro--mingw64-windres"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
findutils \
gawk \
grep \
mingw64-cross-binutils-utils \
mingw64-cross-pkgconf-utils \
python3 \
rpm \
rpmlint-mini \
sed"

inherit rpm
