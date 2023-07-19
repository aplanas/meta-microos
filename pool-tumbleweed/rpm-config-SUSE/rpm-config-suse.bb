SUMMARY = "SUSE specific RPM configuration files"
DESCRIPTION = "This package contains the RPM configuration data for the SUSE and \
openSUSE distribution families."
LICENSE = "GPL-2.0-or-later"

PV = "20230712"

RPM_NAME = "rpm-config-SUSE-20230712-1.1.noarch.rpm"
RPM_HASH = "240c35801b560d49fa069ae537819f9c7d40a749e731900b89b071f19d82fde3ae15f24d12b9bc7e6be1aab83e4d2229435294ebfc1cb1a9a3de4c755cc7eb04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-config-SUSE \
rpm-macro--binarychangelogtrim \
rpm-macro--vpath-builddir \
rpm-macro--vpath-srcdir \
rpm-macro-ext-info \
rpm-macro-ext-man \
rpm-macro-ldconfig \
rpm-macro-ldconfig-post \
rpm-macro-ldconfig-postun \
rpm-macro-ldconfig-scriptlets \
rpm-macro-regenerate-initrd-post \
rpm-macro-regenerate-initrd-posttrans \
rpm-macro-sbat-distro \
rpm-macro-sbat-distro-opensuse \
rpm-macro-sbat-distro-sle \
rpm-macro-sbat-distro-summary \
rpm-macro-sbat-distro-summary-opensuse \
rpm-macro-sbat-distro-summary-sle \
rpm-macro-sbat-distro-url \
rpm-macro-user-group-add"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
rpm"

inherit rpm
