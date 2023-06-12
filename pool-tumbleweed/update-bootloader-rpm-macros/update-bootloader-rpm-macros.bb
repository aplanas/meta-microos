SUMMARY = "RPM macros for update-bootloader"
DESCRIPTION = "This package provides rpm macros for bootloader update in rpm scripts"
LICENSE = "GPL-3.0-or-later"

PV = "0"

RPM_NAME = "update-bootloader-rpm-macros-0-6.2.noarch.rpm"
RPM_HASH = "dddf5ae59c5bd7218122563242f7819633b52032a965215342f267af4fef365beeb72af4e8e9fa3104a9d1db3abb4d4022b1ca678fa6f194daa4e8798754820d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(update_bootloader_check_type_refresh_post) \
rpm_macro(update_bootloader_check_type_reinit_post) \
rpm_macro(update_bootloader_posttrans) \
rpm_macro(update_bootloader_refresh_post) \
rpm_macro(update_bootloader_reinit_post) \
rpm_macro(update_bootloader_requires) \
update-bootloader-rpm-macros"
RDEPENDS:${PN} += ""

inherit rpm
