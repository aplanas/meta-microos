SUMMARY = "SUSE HPC Environment"
DESCRIPTION = "Provide rpm macros for building and installing SUSE HPC \
packages."
LICENSE = "BSD-3-Clause"

PV = "0.5.20230501.968c9cb"

RPM_NAME = "suse-hpc-0.5.20230501.968c9cb-1.1.aarch64.rpm"
RPM_HASH = "00cac8aeb5d4a83b529e151c0e8357bc6bcc4ef43cb88907645811f8db9066b20f14e3bd748df18c42f39cd5cf1da2d467fc24f30eb5fcdb8a8b41b08bc89022"

RPROVIDES:${PN} += "rpm-macro--hpc-init \
rpm-macro--hpc-module-base \
rpm-macro--hpc-p \
rpm-macro--hpc-python-sysconfig-path \
rpm-macro--hpc-python-ver \
rpm-macro--hpc-write-pkgconfig \
rpm-macro-hpc-PNAME \
rpm-macro-hpc-base \
rpm-macro-hpc-base-dirs \
rpm-macro-hpc-bindir \
rpm-macro-hpc-cf-dirs \
rpm-macro-hpc-cf-install-base \
rpm-macro-hpc-cf-install-path \
rpm-macro-hpc-cf-install-path-base \
rpm-macro-hpc-cf-requires \
rpm-macro-hpc-cf-requires-devel \
rpm-macro-hpc-cmake \
rpm-macro-hpc-cmake-dir \
rpm-macro-hpc-cmake-moddir \
rpm-macro-hpc-compiler-family-path \
rpm-macro-hpc-compress-man \
rpm-macro-hpc-configure \
rpm-macro-hpc-datadir \
rpm-macro-hpc-debug \
rpm-macro-hpc-dirs \
rpm-macro-hpc-docdir \
rpm-macro-hpc-exec-prefix \
rpm-macro-hpc-includedir \
rpm-macro-hpc-infodir \
rpm-macro-hpc-init \
rpm-macro-hpc-install-base \
rpm-macro-hpc-install-path \
rpm-macro-hpc-install-path-base \
rpm-macro-hpc-libdir \
rpm-macro-hpc-libexecdir \
rpm-macro-hpc-localstatedir \
rpm-macro-hpc-make-modules-dir \
rpm-macro-hpc-make-modules-extra-python \
rpm-macro-hpc-mandir \
rpm-macro-hpc-master-package \
rpm-macro-hpc-meson \
rpm-macro-hpc-module-delete-if-default \
rpm-macro-hpc-module-dep-base \
rpm-macro-hpc-module-dep-install \
rpm-macro-hpc-module-dep-path \
rpm-macro-hpc-module-extra-python \
rpm-macro-hpc-module-pname \
rpm-macro-hpc-modulefile-add-pkgconfig-path \
rpm-macro-hpc-modulepath \
rpm-macro-hpc-modules-files \
rpm-macro-hpc-modules-init \
rpm-macro-hpc-mpi-dirs \
rpm-macro-hpc-mpi-family-path \
rpm-macro-hpc-mpi-install-base \
rpm-macro-hpc-mpi-install-path \
rpm-macro-hpc-mpi-install-path-base \
rpm-macro-hpc-mpi-requires \
rpm-macro-hpc-mpi-requires-devel \
rpm-macro-hpc-package-name \
rpm-macro-hpc-package-name-tail \
rpm-macro-hpc-pkgconfig-file \
rpm-macro-hpc-pkgconfigdir \
rpm-macro-hpc-python-master-package \
rpm-macro-hpc-python-mv-to-sitearch \
rpm-macro-hpc-python-sitearch \
rpm-macro-hpc-python-sitearch-no-singlespec \
rpm-macro-hpc-python-sitelib \
rpm-macro-hpc-python-sitelib-no-singlespec \
rpm-macro-hpc-python-version \
rpm-macro-hpc-requires \
rpm-macro-hpc-requires-devel \
rpm-macro-hpc-sbindir \
rpm-macro-hpc-setup \
rpm-macro-hpc-setup-compiler \
rpm-macro-hpc-setup-mpi \
rpm-macro-hpc-sharedstatedir \
rpm-macro-hpc-shebang-prepend-list \
rpm-macro-hpc-shebang-remove \
rpm-macro-hpc-shebang-sanitize-scripts \
rpm-macro-hpc-sysconfdir \
rpm-macro-hpc-upcase \
rpm-macro-hpc-verify-python3 \
rpm-macro-hpc-write-modules-files \
rpm-macro-hpc-write-modules-version-file \
rpm-macro-hpc-write-pkgconfig \
suse-hpc"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6"

inherit rpm
