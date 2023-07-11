SUMMARY = "Translations for package elfutils"
DESCRIPTION = "Provides translations for the 'elfutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-lang-0.189-3.3.noarch.rpm"
RPM_HASH = "c8374fcaea69ef779bf8bb30a43bc6302604ad0a37c2a8d3427b274e3a63ae54323b3547da4949af6c1bd46f336a0c52603d3239c7553ccea78aa1e72fa96291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elfutils-lang \
elfutils-lang-all \
locale-elfutils-de \
locale-elfutils-en@boldquot \
locale-elfutils-en@quot \
locale-elfutils-es \
locale-elfutils-ja \
locale-elfutils-pl \
locale-elfutils-uk"

RDEPENDS:${PN} += "elfutils"

inherit rpm
