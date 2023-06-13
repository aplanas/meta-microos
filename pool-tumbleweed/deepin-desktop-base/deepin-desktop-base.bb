SUMMARY = "Base component for Deepin"
DESCRIPTION = "This package provides some components for the Deepin desktop environment: \
Deepin logo, desktop version, login screen background image, and \
language information."
LICENSE = "GPL-3.0-or-later"

PV = "20.6"

RPM_NAME = "deepin-desktop-base-20.6-1.2.aarch64.rpm"
RPM_HASH = "9404a1ce74fece631679cb838d21ff22a554fb50a033ace0f5cfdfe0dfebbf0df4b3295f965e95eda505534012acb867b1eb42b30780359820696486f3d80c49"

RPROVIDES:${PN} += "config(deepin-desktop-base) \
deepin-desktop-base \
deepin-desktop-base(aarch-64)"

RDEPENDS:${PN} += "distribution-logos"

inherit rpm
