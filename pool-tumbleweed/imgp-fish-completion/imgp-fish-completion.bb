SUMMARY = "Fish Completion for imgp"
DESCRIPTION = "Fish command line completion support for imgp."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "imgp-fish-completion-2.8-1.8.noarch.rpm"
RPM_HASH = "bc91b351dbd9b618aac56b9c36a5837aa32e03f8c7fb93a5f7fc62adb62ce0f598bd291b86ba71961695b493c524b2347157df926002df8ef9bca58755c13f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imgp-fish-completion"
RDEPENDS:${PN} += "imgp"

inherit rpm
