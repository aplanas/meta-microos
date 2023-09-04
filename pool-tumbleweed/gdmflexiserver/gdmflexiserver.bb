SUMMARY = "Compatibility Wrapper for Display Managers"
DESCRIPTION = "The GDMFlexiServer tool interacts with the display manager to \
enable fast user switching. This package contains a wrapper that \
selects the correct Gdmflexiserver implementation, based on the \
running display manager."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdmflexiserver-44.1-3.1.noarch.rpm"
RPM_HASH = "e9efb3484d6b6f23baae5b0f9365d17fc4fe11bd9eb72a26230bfdfb76f8408f11eb304ae6eed355f76990aecb7f55aea31a32fbd5daf62900baec5f192bc6f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdmflexiserver"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
