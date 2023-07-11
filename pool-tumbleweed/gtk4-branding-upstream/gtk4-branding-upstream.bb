SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the upstream theme configuration for widgets and \
icon themes."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.4"

RPM_NAME = "gtk4-branding-upstream-4.10.4-1.2.noarch.rpm"
RPM_HASH = "a40c89bfd367974cb29f6b63a7907ca67c474cca7951562e99da313eb29d6e164d9cd1998be776748d47e1d4cbf7a57e774d25eadd8963a0e15bdc65a6538639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-branding \
gtk4-branding-upstream"

RDEPENDS:${PN} += "libgtk-4-1"

inherit rpm
