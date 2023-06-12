SUMMARY = "Documentation of Audio effects for pipewire applications"
DESCRIPTION = "This package contains documentation of Audio effects for pipewire applications"
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "easyeffects-doc-7.0.3-1.1.noarch.rpm"
RPM_HASH = "f53c3e42fdea5ea5ef7ae929b2ce37c7e5b22e0f8f926f84dabd95063c2221e31ef6443f549253e8ae4b187affcffd3ba0f437d8fda33cca2bc0b15548e44324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easyeffects-doc"
RDEPENDS:${PN} += ""

inherit rpm
