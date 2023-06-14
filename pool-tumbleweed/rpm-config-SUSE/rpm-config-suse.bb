SUMMARY = "SUSE specific RPM configuration files"
DESCRIPTION = "This package contains the RPM configuration data for the SUSE and \
openSUSE distribution families."
LICENSE = "GPL-2.0-or-later"

PV = "20220926"

RPM_NAME = "rpm-config-SUSE-20220926-1.3.noarch.rpm"
RPM_HASH = "0048b4f385ef887fc5b04fc1515f91e5c50945c12368084605487951b4de65b101a40574d857e8e6fb7dc056751cdbda459386a9981621174a2e166e3a73e745"
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
rpm-macro-sbat-distro-summary \
rpm-macro-sbat-distro-url \
rpm-macro-user-group-add"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
rpm"

inherit rpm
