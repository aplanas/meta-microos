SUMMARY = "SELinux policy documentation"
DESCRIPTION = "SELinux policy documentation package"
LICENSE = "GPL-2.0-or-later"

PV = "20230728"

RPM_NAME = "selinux-policy-doc-20230728-1.1.noarch.rpm"
RPM_HASH = "7ebb08d5292dd3603427fd8fdf9a8c5e09dd6d10e14212e36cc6228eb3bcc16cf96e192b52bf8ce4c6ad1f0229af9d8f9be932d00e61b7a2fd0c92c54cb7eab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-doc"

RDEPENDS:${PN} += "/usr/bin/xdg-open \
selinux-policy"

inherit rpm
