SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "oxygen5-icon-theme-5.108.0-1.1.noarch.rpm"
RPM_HASH = "3c5c0ff98db9ee94ba44bd422377a025cdfc2ffcdeb4a27c965bb0439c77d1dc8be5385e0eaac7d5573df17f6f825128b6dfb8b91be7a15596f1f87160342092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme \
oxygen5-icon-theme"

RDEPENDS:${PN} += "hicolor-icon-theme"

inherit rpm
