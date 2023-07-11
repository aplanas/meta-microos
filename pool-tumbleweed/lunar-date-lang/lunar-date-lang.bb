SUMMARY = "Translations for package lunar-date"
DESCRIPTION = "Provides translations for the 'lunar-date' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "lunar-date-lang-2.9.3-2.15.noarch.rpm"
RPM_HASH = "32d4550a01d58fc9287dfeabf30b675873b6adb08b8361f9ae33f873170fe24719cbd4fff7de6bc5f9224ecbe308c273fd57ef09ec5f222fe1205de16c8e890b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lunar-date-zh-CN \
locale-lunar-date-zh-HK \
locale-lunar-date-zh-TW \
lunar-date-lang \
lunar-date-lang-all"

RDEPENDS:${PN} += "lunar-date"

inherit rpm
