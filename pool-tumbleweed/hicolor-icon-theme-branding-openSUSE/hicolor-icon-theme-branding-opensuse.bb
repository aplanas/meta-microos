SUMMARY = "Fallback Icon Theme -- openSUSE Icons"
DESCRIPTION = "This is the default fallback theme used by implementations of the icon \
theme specification. \
 \
This package provides openSUSE icons for hicolor-icon-theme."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "hicolor-icon-theme-branding-openSUSE-42.1-2.13.noarch.rpm"
RPM_HASH = "57688b617d522717c79c0e72c22deda72603a98ce1997b43400bb33753c41d93efc436aa5b4712279f58c03e13c0724dfdf7c5186fc33b4f39571af1be64cb55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hicolor-icon-theme-branding \
hicolor-icon-theme-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme"

inherit rpm
