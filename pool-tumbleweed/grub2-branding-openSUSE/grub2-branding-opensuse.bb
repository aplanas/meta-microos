SUMMARY = "openSUSE Tumbleweed branding for GRUB2"
DESCRIPTION = "openSUSE Tumbleweed branding for the GRUB2's graphical console"
LICENSE = "CC-BY-SA-3.0"

PV = "84.87.20230227"

RPM_NAME = "grub2-branding-openSUSE-84.87.20230227-2.1.noarch.rpm"
RPM_HASH = "6016c914c164ae1c8cf3082a2e6d854a37aa817cc2a0a0c5750fcca6125f27ea70bf127ca57188bffcf0ec6507eb769c2735c9c8a17300fe598f634c9369aeaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-branding \
grub2-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
grub2"

inherit rpm
