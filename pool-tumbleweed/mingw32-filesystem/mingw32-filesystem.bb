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

RPROVIDES:${PN} += "mingw32-bcrypt.dll \
mingw32-d2d1.dll \
mingw32-d3d11.dll \
mingw32-d3d12.dll \
mingw32-dbghelp.dll \
mingw32-dcomp.dll \
mingw32-dwrite.dll \
mingw32-dxgi.dll \
mingw32-filesystem \
mingw32-mpr.dll \
mingw32-ncrypt.dll \
mingw32-odbccp32.dll \
mingw32-userenv.dll \
mingw32-uxtheme.dll \
mingw32-wtsapi32.dll \
rpm-macro--mingw32-addr2line \
rpm-macro--mingw32-ar \
rpm-macro--mingw32-as \
rpm-macro--mingw32-bindir \
rpm-macro--mingw32-cache \
rpm-macro--mingw32-cc \
rpm-macro--mingw32-cflags \
rpm-macro--mingw32-classpath \
rpm-macro--mingw32-configure \
rpm-macro--mingw32-cpp \
rpm-macro--mingw32-cpu \
rpm-macro--mingw32-create-macro-links \
rpm-macro--mingw32-cxx \
rpm-macro--mingw32-cxxflags \
rpm-macro--mingw32-datadir \
rpm-macro--mingw32-debug-install-post \
rpm-macro--mingw32-debug-package \
rpm-macro--mingw32-dlltool \
rpm-macro--mingw32-dllwrap \
rpm-macro--mingw32-docdir \
rpm-macro--mingw32-env \
rpm-macro--mingw32-exec-prefix \
rpm-macro--mingw32-fc \
rpm-macro--mingw32-find-lang \
rpm-macro--mingw32-gcj \
rpm-macro--mingw32-gcov \
rpm-macro--mingw32-gdb \
rpm-macro--mingw32-gprof \
rpm-macro--mingw32-host \
rpm-macro--mingw32-includedir \
rpm-macro--mingw32-infodir \
rpm-macro--mingw32-install-post \
rpm-macro--mingw32-ld \
rpm-macro--mingw32-ldflags \
rpm-macro--mingw32-ldflags-base \
rpm-macro--mingw32-ldflags-bootstrap \
rpm-macro--mingw32-libdir \
rpm-macro--mingw32-libexecdir \
rpm-macro--mingw32-localstatedir \
rpm-macro--mingw32-make \
rpm-macro--mingw32-make-install \
rpm-macro--mingw32-makeinstall \
rpm-macro--mingw32-mandir \
rpm-macro--mingw32-nm \
rpm-macro--mingw32-objcopy \
rpm-macro--mingw32-objdump \
rpm-macro--mingw32-os \
rpm-macro--mingw32-package-header \
rpm-macro--mingw32-package-header-debug \
rpm-macro--mingw32-prefix \
rpm-macro--mingw32-ranlib \
rpm-macro--mingw32-readelf \
rpm-macro--mingw32-sbindir \
rpm-macro--mingw32-sharedstatedir \
rpm-macro--mingw32-size \
rpm-macro--mingw32-strings \
rpm-macro--mingw32-strip \
rpm-macro--mingw32-sysconfdir \
rpm-macro--mingw32-sysroot \
rpm-macro--mingw32-target \
rpm-macro--mingw32-vendor \
rpm-macro--mingw32-windmc \
rpm-macro--mingw32-windres"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
