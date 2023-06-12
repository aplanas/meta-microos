SUMMARY = "RPM macros for building Kernel Module Packages"
DESCRIPTION = "This package provides the rpm macros and templates for Kernel Module Pakcages \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-macros-6.3.4-1.1.noarch.rpm"
RPM_HASH = "163a50830304f535f9773f8250197217785494a859762fab997a7949cb683e97a12d56a8afa2a311757cdafc63c92f4f344ca21a426edb6dcb95146bb3d22302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-macros \
kernel-subpackage-macros \
rpm_macro(_kernel_module_package) \
rpm_macro(cpu_arch) \
rpm_macro(kernel_build_shell_package) \
rpm_macro(kernel_module_directory) \
rpm_macro(kernel_module_package) \
rpm_macro(kernel_module_package_buildreqs) \
rpm_macro(kernel_module_package_release) \
rpm_macro(linux_arch) \
rpm_macro(linux_make_arch) \
rpm_macro(suse_kernel_module_package)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh"

inherit rpm
