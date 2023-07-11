SUMMARY = "openSUSE Branding of xfce4-notifyd"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Notification Daemon."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-notifyd-branding-openSUSE-4.18.0+git0.9a2f754-1.6.noarch.rpm"
RPM_HASH = "36d374b34a0171b6b312febf8dbd8667fc59b089bb777ae36e4b2178c965bfcc7f5bee3a2361bdaaaeb432c6f5461bb3fce36748d94a249cb58a1a935503f8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-notifyd-branding-openSUSE \
xfce4-notifyd-branding \
xfce4-notifyd-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
